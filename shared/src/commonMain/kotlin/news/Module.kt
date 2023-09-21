package news

import news.Article
import news.newsapi.NewsAPI
import news.newsdata.NewsData
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.bindFactory
import org.kodein.di.bindProvider
import org.kodein.di.bindSingleton
import org.kodein.di.factory
import org.kodein.di.instance

val newsModule = DI.Module("News") {
    bindSingleton {
        CurrentSettings()
    }
    bindSingleton {
        NewsAdapter(instance(), di)
    }
    bindProvider {
        NewsSM(instance(), instance())
    }
    bindProvider { SettingsModel(instance()) }

    bind {
        factory { article: Article -> ImageLoader(instance(), article) }
    }

    bindFactory<ApiKey, News<*>> {
        NewsData(it.apiKey)
    }
}


data class ApiKey(val apiKey: String)