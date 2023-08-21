package news

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.lighthousegames.logging.logging

class NewsAPI(private val apiKey: String, val client: HttpClient = defaultClient) {


    suspend fun topNews(countryKey: String = "sg"): Result<NewsResponse> = runCatching{
        val response = client.get("https://newsapi.org/v2/top-headlines?country=$countryKey&apiKey=$apiKey")
        check(response.status.value < 400) {
            error("Error calling news: ${response.status.value} - ${response.status.description}")
        }
        val body = response.bodyAsText()
        Json.decodeFromString<NewsResponse>(body)
    }.onFailure {
        logger.error(it) {"Error retrieving topNews"}
    }

    companion object {
        private val defaultClient =  HttpClient()
        private val logger = logging()
    }
}


@Serializable
data class NewsResponse(var status: String, var totalResults: Int, var articles: List<Article> = listOf())


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


