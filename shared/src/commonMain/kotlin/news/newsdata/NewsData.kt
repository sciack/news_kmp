@file:UseSerializers(LocalDateTimeSerializer::class)

package news.newsdata

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import news.Article
import news.News
import news.NewsAdapter
import news.Source
import news.ToArticle
import org.lighthousegames.logging.logging

class NewsData(private val apiKey: String, val client: HttpClient = NewsAdapter.defaultClient) :
    News<List<NewsDataArticle>> {


    override suspend fun topNews(country: String): Result<List<NewsDataArticle>> = runCatching {
        val response =
            client.get("https://newsdata.io/api/1/news?country=$country&category=top&apikey=$apiKey")
        check(response.status.value < 400) {
            error("Error calling news: ${response.status.value} - ${response.status.description}")
        }
        val body = response.bodyAsText()
        gitlabJson.decodeFromString<NewsDataResponse>(body).results
    }.onFailure {
        logger.error(it) { "Error retrieving topNews" }
    }

    suspend fun fetchArticleImage(article: NewsDataArticle) = runCatching {
        require(!article.imageUrl.isNullOrEmpty()) {
            "Image url is null"
        }
        val response = client.get(article.imageUrl.orEmpty())
        check(response.status.value < 400) {
            error("Error retrieving the image: ${response.status.value} - ${response.status.description}")
        }
        response.readBytes()
    }.onFailure {
        logger.error(it) { "Error retrieving the image" }
    }

    companion object {

        private val logger = logging()

        @OptIn(ExperimentalSerializationApi::class)
        val gitlabJson = Json {
            this.ignoreUnknownKeys = true
            this.coerceInputValues = true
        }
    }
}


@Serializable
data class NewsDataResponse(
    val status: String,
    val totalResults: Int,
    val results: List<NewsDataArticle>,
    val nextPage: Long
)

@Serializable
data class NewsDataArticle(
    @SerialName("article_id")
    val articleId: String,
    val title: String,
    val link: String,
    val keywords: List<String>?,
    val creator: String?,
    @SerialName("video_url")
    val videoUrl: String?,
    val description: String?,
    val content: String?,

    val pubDate: LocalDateTime,
    @SerialName("image_url")
    val imageUrl: String?,
    @SerialName("source_id")
    val sourceId: String?,
    @SerialName("source_priority")
    val sourcePriority: Int,
    val country: List<String>,
    val category: List<String>,
    val language: String
) : ToArticle {
    override fun toArticle(): Article =
        Article(
            source = Source(sourceId, creator),
            author = creator,
            title = title,
            description = description,
            url = link,
            urlToImage = imageUrl,
            publishedAt = pubDate.toInstant(TimeZone.currentSystemDefault()),
            content = content
        )

}

object LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    override val descriptor: SerialDescriptor = LocalDateTime.serializer().descriptor

    override fun serialize(encoder: Encoder, value: LocalDateTime) {
        val dateString = value.toString().replace("T", " ")
        encoder.encodeSerializableValue(String.serializer(), dateString)
    }

    override fun deserialize(decoder: Decoder): LocalDateTime {
        val dateString = decoder.decodeSerializableValue(String.serializer())

        return LocalDateTime.parse(dateString.replace(" ", "T"))
    }
}