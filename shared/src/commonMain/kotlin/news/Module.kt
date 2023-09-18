package news

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.bindProvider
import org.kodein.di.bindSingleton
import org.kodein.di.factory
import org.kodein.di.instance

val newsModule = DI.Module("News") {
    bindSingleton {
        CurrentSettings()
    }
    bindProvider {
        NewsSM(instance())
    }
    bindProvider { SettingsModel(instance()) }

    bind {
        factory { article: Article -> ImageLoader(instance(), article) }
    }
}