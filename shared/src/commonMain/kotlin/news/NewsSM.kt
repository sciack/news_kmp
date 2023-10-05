package news

import androidx.compose.runtime.mutableStateOf
import cafe.adriel.voyager.core.model.StateScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Resource
import org.lighthousegames.logging.logging

class NewsSM(private val newsAdapter: News) :
    StateScreenModel<NewsSM.State>(State.Loading) {
    val isRefreshing = mutableStateOf(false)

    sealed interface State {
        data object Loading : State
        data class Loaded(val articles: List<Article>) : State
    }

    fun loadArticles() {
        coroutineScope.launch {
            isRefreshing.value = true
            newsAdapter.topNews()
                .onFailure {
                    isRefreshing.value = false
                    logging().error(it) { "Error retrieving the news" }
                }.onSuccess { topNews ->
                    isRefreshing.value = false
                    mutableState.emit(State.Loaded(topNews))
                }
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
class ImageLoader(private val newsAdapter: News, private val article: Article) :
    Resource {
    override suspend fun readBytes(): ByteArray {
        logging().info { "Loading image for article: ${article.title}" }
        return newsAdapter.fetchArticleImage(article).getOrThrow()
    }
}