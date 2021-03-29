package learn.jetpack.compose.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import learn.jetpack.compose.app.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage()
        }
    }
}

@Preview
@Composable
fun HomePage() {
    LearnJetpackComposeTheme {
        Surface(color = MaterialTheme.colors.background) {
            Text(text = "Hello Jetpack Compose")
        }
    }

}
