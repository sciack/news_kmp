import news.Article
import news.ImageLoader
import news.NewsSM
import news.newsModule
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.bindFactory
import org.kodein.di.bindProvider
import org.kodein.di.instance
import org.kodein.di.singleton

fun testDI() = DI {
    import(newsModule)
    import(newsTestModule)
}


val newsTestModule = DI.Module("NewsTest") {
    bind("test") {
        singleton {
            TestNews()
        }
    }
    bindProvider("test") {
        NewsSM(instance("test"))
    }

    bindFactory("test") { article: Article ->
        ImageLoader(instance("test"), article)
    }

}

