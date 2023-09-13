package news

import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Divider
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.russhwolf.settings.Settings
import com.russhwolf.settings.set

class SettingsModel : ScreenModel {

    val apiKey = mutableStateOf(CurrentSettings.apiKey)
}

class SettingsScreen : Screen {


    @Composable
    override fun Content() {
        val setColorScheme = ColorScheme.LocalSetColorScheme.current
        val navigator = LocalNavigator.currentOrThrow
        val screenModel = rememberScreenModel { SettingsModel() }

        val apiKey = remember { screenModel.apiKey }
        val darkMode = remember {
            mutableStateOf(CurrentSettings.darkMode)
        }
        val expanded = remember { mutableStateOf(false) }

        Column(modifier = Modifier.fillMaxWidth()) {
            Row(Modifier.padding(bottom = 12.dp)) {
                Text(
                    "Dark Mode",
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Spacer(Modifier.width(12.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().border(
                        1.dp,
                        color = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
                        shape = RectangleShape
                    ).align(Alignment.CenterVertically)
                ) {
                    Text(
                        darkMode.value.name,
                        modifier = Modifier.align(Alignment.CenterVertically).padding(12.dp)
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .wrapContentSize(Alignment.TopEnd)
                    ) {

                        IconButton(onClick = { expanded.value = !expanded.value }) {
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "More"
                            )
                        }
                        DropdownMenu(
                            expanded = expanded.value,
                            onDismissRequest = { expanded.value = false },

                            ) {
                            DarkModes.values().forEach { mode ->
                                DropdownMenuItem(
                                    onClick = {
                                        darkMode.value = mode
                                        expanded.value = false
                                    }
                                ) { Text(mode.name) }
                            }
                        }
                    }
                }
                Spacer(Modifier.width(12.dp))
            }

            Divider()
            OutlinedTextField(value = apiKey.value,
                onValueChange = {
                    apiKey.value = it
                },
                label = { Text("ApiKey") }
            )
            Row {
                Button(onClick = {
                    CurrentSettings.apiKey = apiKey.value
                    CurrentSettings.darkMode = darkMode.value
                    setColorScheme(darkMode.value)
                    navigator.pop()
                }) {
                    Text("Confirm")
                }
                Spacer(Modifier.width(12.dp))
                Button(onClick = {
                    navigator.pop()
                }) {
                    Text("Cancel")
                }
            }
        }

    }
}


object CurrentSettings {
    private val settings: Settings = Settings()

    var darkMode: DarkModes
        get() =
            kotlin.runCatching {
                DarkModes.valueOf(settings.getString("darkMode", DarkModes.SYSTEM_DEFAULT.name))
            }.getOrDefault(DarkModes.SYSTEM_DEFAULT)
        set(value) {
            settings["darkMode"] = value.name
        }
    var apiKey: String
        get() = settings.getString("apiKey", "")
        set(value) {
            settings["apiKey"] = value
        }
}

enum class DarkModes {
    DARK,
    LIGHT,
    SYSTEM_DEFAULT;

    @Composable
    fun isDarkMode(): Boolean = when (this) {
        DARK -> true
        LIGHT -> false
        SYSTEM_DEFAULT -> isSystemInDarkTheme()
    }
}
object ColorScheme {
    val LocalColorScheme = staticCompositionLocalOf { DarkModes.SYSTEM_DEFAULT }
    val LocalSetColorScheme = staticCompositionLocalOf<(DarkModes) -> Unit> { {} }
}