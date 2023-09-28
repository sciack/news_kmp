package news

import TestNews
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import com.github.javafaker.Faker
import kotlinx.coroutines.test.runTest
import kotlinx.datetime.Clock
import org.junit.Rule
import org.kodein.di.compose.withDI
import org.kodein.di.instance
import testDI
import kotlin.test.Test

class NewsViewTest {
    private val faker = Faker()
    private val di = testDI()

    @get:Rule
    val rule = createComposeRule()

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun `should display the news`() = runTest {
        val testNews by di.instance<TestNews>("test")
        val newsSM by di.instance<NewsSM>("test")
        val article = Article(
            Source(),
            author = faker.book().author(),
            title = faker.book().title(),
            content = faker.shakespeare().hamletQuote(),
            description = faker.dune().quote(),
            publishedAt = Clock.System.now(),
            url = null,
            urlToImage = null
        )
        testNews.articles = listOf(article)
        rule.setContent {
            withDI(di) {
                NewsList(newsSM)
            }
        }
        rule.awaitIdle()
        rule.waitUntilExactlyOneExists(hasText(article.title!!), 1000)
    }
}
