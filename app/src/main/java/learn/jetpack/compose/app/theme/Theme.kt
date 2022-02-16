package learn.jetpack.compose.app.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val LightColor = lightColors(
  primary = PrimaryColor,
  primaryVariant = PrimaryColor,
  secondary = PrimaryColor,
)

@Composable
fun ComposeMaterialTheme(content: @Composable() () -> Unit) {
  MaterialTheme(
    colors = LightColor,
    typography = Typography,
    shapes = Shapes,
    content = content,
  )
}