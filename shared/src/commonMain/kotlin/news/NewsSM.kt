package news

import cafe.adriel.voyager.core.model.StateScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Resource
import org.lighthousegames.logging.logging

class NewsSM(private val settings: CurrentSettings) :
    StateScreenModel<NewsSM.State>(State.Loading) {

    sealed interface State {
        data object Loading : State
        data class Loaded(val articles: List<Article>) : State
    }

    fun loadArticles() {
        coroutineScope.launch {
            val newsApi = NewsAPI(settings.apiKey)
            newsApi.topNews()
                .onFailure {
                    logging().error(it) { "Error retrieving the news" }
                }.onSuccess { topNews ->
                    mutableState.emit(State.Loaded(topNews.articles))
                }
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
class ImageLoader(private val currentSettings: CurrentSettings, private val article: Article) :
    Resource {
    override suspend fun readBytes(): ByteArray {
        logging().info { "Loading image for article: ${article.title}" }
        val newsApi = NewsAPI(currentSettings.apiKey)
        return newsApi.fetchArticleImage(article).getOrThrow()
    }
}