import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import news.SettingsScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


@Composable
fun App() {
    MaterialTheme {
        Navigator(HomeScreen()) {navigator ->
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text("News")
                        },
                        navigationIcon = {
                            if (navigator.canPop) {
                                IconButton(onClick = {
                                    navigator.pop()
                                }) {
                                    Icon(Icons.Default.ArrowBack, "Back")
                                }
                            }
                        },
                        actions = {

                            IconButton(
                                onClick = {
                                    navigator.push(SettingsScreen())
                                },
                            ) {
                                Icon(Icons.Default.Settings, "Settings")
                            }
                        }
                    )
                }
            ) {
                CurrentScreen()
            }
        }
    }
}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect fun getPlatformName(): String



@OptIn(ExperimentalResourceApi::class)
class HomeScreen: Screen {

    @Composable
    override fun Content() {
        var greetingText by remember { mutableStateOf("Hello, World!") }
        var showImage by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                greetingText = "Hello, ${getPlatformName()}"
                showImage = !showImage
            }) {
                Text(greetingText)
            }
            AnimatedVisibility(showImage) {
                Image(
                    painterResource("compose-multiplatform.xml"),
                    null
                )
            }
        }
    }
}