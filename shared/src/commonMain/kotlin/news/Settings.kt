package news

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
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
            Row {
                Button(onClick = {
                    CurrentSettings.apiKey = apiKey.value
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

    var apiKey: String
        get() = settings.getString("apiKey", "")


        set(value) {
            settings["apiKey"] = value
        }
}

