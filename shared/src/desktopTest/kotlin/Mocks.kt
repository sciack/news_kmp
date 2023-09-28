import news.Article
import news.News

class TestNews() : News {

    var articles: List<Article> = listOf()
    override suspend fun topNews(): Result<List<Article>> {
        return Result.success(articles)
    }

    override suspend fun fetchArticleImage(article: Article): Result<ByteArray> {
        return Result.success(ByteArray(0))
    }
}