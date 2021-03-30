package learn.jetpack.compose.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import learn.jetpack.compose.app.ui.theme.ComposeMaterialTheme
import learn.jetpack.compose.app.ui.theme.PrimaryColor

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomePage()
}

@Composable
fun HomePage() {
    ComposeMaterialTheme {
        TopAppBar(
            backgroundColor = PrimaryColor,
            title = { Text("Learn Jetpack Compose") }
        )
    }
}