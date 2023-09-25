package news.newsapi

import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.HttpStatusCode
import kotlinx.coroutines.test.runTest
import news.topNewsJson
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class NewsAPITest {
    // To be removed
    private val apiKey = "fakeKey"
    private val mockEngine = MockEngine { request ->
        assertEquals("newsapi.org", request.url.host)
        assertEquals("/v2/top-headlines", request.url.encodedPath)
        val responseCode = if (request.url.encodedQuery.contains("apiKey=$apiKey")) {
            HttpStatusCode.OK
        } else {
            HttpStatusCode.Unauthorized
        }
        respond(
            content = topNewsJson,
            status = responseCode,
        )
    }

    @Test
    fun `should get the news from api`() {
        runTest {
            val mockClient = HttpClient(mockEngine)
            val response = NewsAPIOrg(apiKey, mockClient).topNews()
            assertTrue(response.isSuccess)
            assertEquals(87, response.getOrThrow().size)
        }
    }


    @Test
    fun `should return an error if the call fails`() {
        runTest {

            val mockClient = HttpClient(mockEngine)
            val response = NewsAPIOrg("123", mockClient).topNews()
            assertTrue(response.isFailure)
        }
    }
}