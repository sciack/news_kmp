package news

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Resource
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.lighthousegames.logging.logging

@OptIn(ExperimentalResourceApi::class)
@Composable
fun NewsList() {
    val coroutineScope = rememberCoroutineScope()
    val topNews = remember {
        loadNewsList(coroutineScope)
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        state = rememberLazyListState()
    ) {
        items(topNews, key = { article -> article.title.hashCode() }) { article ->
            Row {
                if (!article.urlToImage.isNullOrEmpty()) {

                    val resource = remember {
                        ImageLoader(article)
                    }
                    val imageBitmap = resource.rememberImageBitmap().orEmpty()
                    logging().info{"Loading image for article: ${article.title}"}
                    Image(imageBitmap, article.title, contentScale = ContentScale.Fit, modifier = Modifier.height(120.dp).align(Alignment.CenterVertically))
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


fun loadNewsList(coroutineScope: CoroutineScope): SnapshotStateList<Article> {
    val result = mutableStateListOf<Article>()
    coroutineScope.launch {
        val newsApi = NewsAPI(CurrentSettings.apiKey)
        result.clear()
        newsApi.topNews("sg").onSuccess {
            result.addAll(it.articles)
        }.onFailure {
            logging().error(it) { "Error retrieving the news" }
        }

    }
    return result
}

@OptIn(ExperimentalResourceApi::class)
class ImageLoader(val article: Article) : Resource {
    override suspend fun readBytes(): ByteArray {
        val newsApi = NewsAPI(CurrentSettings.apiKey)
        return newsApi.fetchArticleImage(article).getOrThrow()
    }
}