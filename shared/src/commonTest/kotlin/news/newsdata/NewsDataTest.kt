package news.newsdata

import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpStatusCode
import kotlinx.coroutines.test.runTest
import news.topNewsData
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NewsDataTest {
    private val apiKey = "fakeKey"

    private val mockEngine = MockEngine { request ->
        assertEquals("newsdata.io", request.url.host)
        assertEquals("/api/1/news", request.url.encodedPath)
        val responseCode = if (request.url.encodedQuery.contains("apikey=$apiKey")) {
            HttpStatusCode.OK
        } else {
            HttpStatusCode.Unauthorized
        }
        respond(
            content = topNewsData,
            status = responseCode,
        )
    }

    @Test
    fun `should get the news from api`() {
        runTest {
            val mockClient = HttpClient(mockEngine)
            val response = NewsData(apiKey, mockClient).topNews()
            assertTrue(response.isSuccess)
            assertEquals(50, response.getOrThrow().size)
        }
    }
}