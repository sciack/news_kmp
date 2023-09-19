import io.ktor.util.reflect.instanceOf
import news.newsModule
import org.kodein.di.DI
import org.kodein.di.factory

val di = DI {
    import(newsModule)
}


inline fun <reified A: Any, reified T: Any> DI.instanceWithArgs(arg: A): T {
    val factory by factory<A,T>()
    return factory.invoke(arg)
}