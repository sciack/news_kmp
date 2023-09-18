package news

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Resource
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.kodein.di.compose.rememberFactory
import org.lighthousegames.logging.logging

@OptIn(ExperimentalResourceApi::class)
@Composable
fun NewsList(newsSM: NewsSM) {

    val state by newsSM.state.collectAsState()
    if (state is NewsSM.State.Loading) {
        Column(modifier = Modifier.fillMaxSize()){
            CircularProgressIndicator(Modifier.size(48.dp).align(Alignment.CenterHorizontally))
        }
        LaunchedEffect("Load articles") {
            newsSM.loadArticles()
        }
    } else if(state is NewsSM.State.Loaded ){
        val topNews = (state as NewsSM.State.Loaded).articles
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = rememberLazyListState()
        ) {
            items(topNews, key = { article -> article.title.hashCode() }) { article ->
                Row {
                    if (!article.urlToImage.isNullOrEmpty()) {

                        val resource by rememberFactory<Article, ImageLoader>()
                        val imageBitmap = resource(article).rememberImageBitmap().orEmpty()
                        logging().info { "Loading image for article: ${article.title}" }
                        Image(
                            imageBitmap,
                            article.title,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier.height(120.dp).align(Alignment.CenterVertically)
                        )
                    }
                    Column {
                        Text(
                            article.title.orEmpty(),
                            style = MaterialTheme.typography.h4
                        )
                        Text(
                            article.content.orEmpty(),
                            style = MaterialTheme.typography.subtitle1
                        )
                        Divider(color = Color.LightGray, thickness = 1.dp)
                    }
                }

            }
        }
    }
}


@OptIn(ExperimentalResourceApi::class)
class ImageLoader(private val currentSettings: CurrentSettings, private val article: Article) :
    Resource {
    override suspend fun readBytes(): ByteArray {
        val newsApi = NewsAPI(currentSettings.apiKey)
        return newsApi.fetchArticleImage(article).getOrThrow()
    }
}