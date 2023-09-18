import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.darkColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.kodein.rememberScreenModel
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import news.CurrentSettings
import news.LocalColorScheme
import news.LocalSetColorScheme
import news.NewsList
import news.SettingsScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.kodein.di.compose.rememberInstance
import org.kodein.di.compose.withDI


@Composable
fun App() {
    withDI(di) {
        val currentSettings by rememberInstance<CurrentSettings>()
        val (colorScheme, setColorScheme) = remember {
            mutableStateOf(currentSettings.darkMode)
        }
        CompositionLocalProvider(
            LocalColorScheme provides colorScheme,
            LocalSetColorScheme provides setColorScheme
        ) {
            val darkMode = LocalColorScheme.current
            val colorSchema = if (darkMode.isDarkMode()) {
                darkColors()
            } else {
                lightColors()
            }
            MaterialTheme(colorSchema) {
                mainBody()
            }
        }
    }
}

@Composable
private fun mainBody() {
    Navigator(HomeScreen()) { navigator ->
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

expect fun getPlatformName(): String

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        NewsList(rememberScreenModel())
    }
}