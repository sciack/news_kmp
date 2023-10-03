package news

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import instanceWithArgs
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.orEmpty
import org.jetbrains.compose.resources.rememberImageBitmap
import org.kodein.di.compose.localDI

@OptIn(ExperimentalResourceApi::class, ExperimentalMaterialApi::class)
@Composable
fun NewsList(newsSM: NewsSM) {
    val di = localDI()
    val state by newsSM.state.collectAsState()
    when (state) {
        is NewsSM.State.Loading -> {
            Column(modifier = Modifier.fillMaxSize()) {
                CircularProgressIndicator(Modifier.size(48.dp).align(Alignment.CenterHorizontally))
            }
            LaunchedEffect("Load articles") {
                newsSM.loadArticles()
            }
        }

        is NewsSM.State.Loaded -> {
            val topNews = (state as NewsSM.State.Loaded).articles
            val isRefreshing by remember { mutableStateOf(false) }
            val pullRefreshState = rememberPullRefreshState(
                refreshing = isRefreshing,
                onRefresh = {
                    newsSM.loadArticles()
                }
            )
            Box(modifier = Modifier.pullRefresh(pullRefreshState)) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    state = rememberLazyListState()
                ) {

                    items(topNews, key = { article -> article.title.hashCode() }) { article ->
                        Row {
                            if (!article.urlToImage.isNullOrEmpty()) {

                                val imageLoader = remember {
                                    di.instanceWithArgs<Article, ImageLoader>(article)
                                }
                                val imageBitmap = imageLoader.rememberImageBitmap().orEmpty()

                                Image(
                                    imageBitmap,
                                    article.title,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier.height(120.dp)
                                        .align(Alignment.CenterVertically)
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
                PullRefreshIndicator(
                    refreshing = isRefreshing,
                    state = pullRefreshState,
                    modifier = Modifier.align(Alignment.TopCenter)
                )
            }
        }
    }

}

