package news

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.russhwolf.settings.Settings
import com.russhwolf.settings.set

class SettingsModel : ScreenModel {

    val apiKey = mutableStateOf(apiKey())
}

class SettingsScreen : Screen {


    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val screenModel = rememberScreenModel { SettingsModel() }

        val apiKey = remember { screenModel.apiKey }

        Column(modifier = Modifier.fillMaxWidth(0.7f)) {
            OutlinedTextField(value = apiKey.value,
                onValueChange = {
                    apiKey.value = it
                },
                label = { Text("ApiKey") }
            )
            Button(onClick = {
                settings.set("apiKey", apiKey.value)
                navigator.pop()
            }) {
                Text("Confirm")
            }
        }
    }
}

val settings: Settings = Settings()

fun apiKey(): String =
    settings.getString("apiKey", "")