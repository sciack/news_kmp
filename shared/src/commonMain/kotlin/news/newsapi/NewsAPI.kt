package news.newsapi

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.client.statement.readBytes
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import news.News
import news.NewsAdapter
import news.ToArticle
import org.lighthousegames.logging.logging

class NewsAPI(private val apiKey: String, val client: HttpClient = NewsAdapter.defaultClient) :
    News<List<Article>> {


    override suspend fun topNews(country: String): Result<List<Article>> = runCatching {
        val response =
            client.get("https://newsapi.org/v2/top-headlines?country=$country&apiKey=$apiKey")
        check(response.status.value < 400) {
            error("Error calling news: ${response.status.value} - ${response.status.description}")
        }
        val body = response.bodyAsText()
        Json.decodeFromString<NewsResponse>(body).articles
    }.onFailure {
        logger.error(it) { "Error retrieving topNews" }
    }


    companion object {

        private val logger = logging()
    }
}


@Serializable
data class NewsResponse(
    var status: String,
    var totalResults: Int,
    var articles: List<Article> = listOf()
)


@Serializable
data class Article(
    var source: Source,
    var author: String?,
    var title: String? = null,
    var description: String? = null,
    var url: String? = null,
    var urlToImage: String? = null,
    var publishedAt: Instant = Clock.System.now(),
    var content: String? = null
) : ToArticle {
    override fun toArticle(): news.Article = news.Article(
        news.Source(source.id, source.name),
        author,
        title,
        description,
        url,
        urlToImage,
        publishedAt,
        content
    )

}


@Serializable
data class Source(var id: String? = null, var name: String? = null)


