package news

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.readBytes
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import org.kodein.di.DI
import org.kodein.di.factory
import org.lighthousegames.logging.logging

class NewsAdapter(private val settings: CurrentSettings, private val di: DI) {

    suspend fun topNews(): Result<List<Article>> {
        val apiKey = settings.apiKey
        val newsFactory by di.factory<ApiKey, News<*>>()
        val newsApi = newsFactory(ApiKey(apiKey))
        return newsApi.topNews().map { articles ->
            articles.map { article ->
                article.toArticle()
            }
        }
    }

    suspend fun fetchArticleImage(article: Article) = runCatching {
        require(!article.urlToImage.isNullOrEmpty()) {
            "Image url is null"
        }
        val response = defaultClient.get(article.urlToImage.orEmpty())
        check(response.status.value < 400) {
            error("Error retrieving the image: ${response.status.value} - ${response.status.description}")
        }
        response.readBytes()
    }.onFailure {
        logger.error(it) { "Error retrieving the image" }
    }


    companion object {
        val defaultClient = HttpClient()
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
)


@Serializable
data class Source(var id: String? = null, var name: String? = null)


interface News<T : List<ToArticle>> {
    suspend fun topNews(country: String = "vi"): Result<T>
}

interface ToArticle {

    fun toArticle(): Article
}