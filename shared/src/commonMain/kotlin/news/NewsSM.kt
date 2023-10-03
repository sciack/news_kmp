package news

import cafe.adriel.voyager.core.model.StateScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Resource
import org.lighthousegames.logging.logging

class NewsSM(private val newsAdapter: News) :
    StateScreenModel<NewsSM.State>(State.Loading) {

    sealed interface State {
        data object Loading : State
        data class Loaded(val articles: List<Article>) : State
    }

    fun loadArticles() {
        logging().info { "Reloading the articles"}
        coroutineScope.launch {
            newsAdapter.topNews()
                .onFailure {
                    logging().error(it) { "Error retrieving the news" }
                }.onSuccess { topNews ->
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