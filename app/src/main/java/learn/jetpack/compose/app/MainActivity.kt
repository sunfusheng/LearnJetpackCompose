package learn.jetpack.compose.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Column {
            TopAppBar(
                backgroundColor = PrimaryColor,
                title = { Text("Learn Jetpack Compose") }
            )
            CommonItemView(title = "Test") {

            }
        }
    }
}

@Composable
fun CommonItemView(title: String, onClick: () -> Unit) {
    Column {
        Text(
            text = title,
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .fillMaxWidth(),

            )
    }
}