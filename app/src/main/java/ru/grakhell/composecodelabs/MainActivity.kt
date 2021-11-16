package ru.grakhell.composecodelabs

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.grakhell.composecodelabs.basicscodelab.App
import ru.grakhell.composecodelabs.basicscodelab.Greetings
import ru.grakhell.composecodelabs.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                Surface(color = MaterialTheme.colors.background) {
                    App()
                }
            }
        }
    }

    @Preview(
        showBackground = true,
        widthDp = 320,
        name = "OnboardingPreview")
    @Composable
    fun OnboardingPreview() {
        BasicsCodelabTheme {
            App()
        }
    }

    @Preview(showBackground = true, widthDp = 320)
    @Composable
    fun DefaultPreview() {
        BasicsCodelabTheme {
            Greetings()
        }
    }

    @Preview(
        showBackground = true,
        widthDp = 320,
        uiMode = UI_MODE_NIGHT_YES,
        name = "DefaultPreviewDark"
    )
    @Composable
    fun DefaultDarkPreview() {
        BasicsCodelabTheme {
            Greetings()
        }
    }
}

