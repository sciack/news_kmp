package news

import io.ktor.client.*
import io.ktor.client.engine.mock.*
import io.ktor.http.*
import kotlinx.coroutines.test.runTest
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
            val response = NewsAPI(apiKey, mockClient).topNews()
            assertTrue(response.isSuccess)
            assertEquals(87, response.getOrThrow().totalResults)
        }
    }


    @Test
    fun `should return an error if the call fails`() {
        runTest {

            val mockClient = HttpClient(mockEngine)
            val response = NewsAPI("123", mockClient).topNews()
            assertTrue(response.isFailure)
        }
    }
}