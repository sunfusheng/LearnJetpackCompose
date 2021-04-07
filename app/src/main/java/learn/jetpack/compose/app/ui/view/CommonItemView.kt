package learn.jetpack.compose.app.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import learn.jetpack.compose.app.ui.theme.Font1Color

@Composable
fun CommonItemView(title: String, topMargin: Dp = 0.dp, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(top = topMargin)
            .background(Color.White)
            .fillMaxWidth()
            .clickable(onClick = onClick),
    ) {
        Text(
            text = title,
            color = Font1Color,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultCommonItemView() {
    CommonItemView("标题", 20.dp) {

    }
}