package news

import cafe.adriel.voyager.core.model.StateScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.launch
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
            val topNews = newsApi.topNews().onFailure {
                logging().error(it) { "Error retrieving the news" }
            }.onSuccess { topNews ->
                mutableState.emit(State.Loaded(topNews.articles))
            }
        }
    }
}