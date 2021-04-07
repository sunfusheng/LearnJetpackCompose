package learn.jetpack.compose.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import learn.jetpack.compose.app.ui.theme.BackgroundCommonColor
import learn.jetpack.compose.app.ui.theme.ComposeMaterialTheme
import learn.jetpack.compose.app.ui.theme.PrimaryColor
import learn.jetpack.compose.app.ui.view.CommonItemView

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
fun DefaultHomePage() {
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
            Column(
                modifier = Modifier
                    .background(BackgroundCommonColor)
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                CommonItemView(title = "标题", topMargin = 20.dp) {

                }
            }
        }
    }
}