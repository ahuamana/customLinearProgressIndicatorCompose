package com.paparazziteam.customlinearprogressindicar.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomLinearProgressIndicator(
    roundCornerShape: RoundedCornerShape = RoundedCornerShape(20.dp),
    colorIndicator : Color = Color(0xFF00BFA5),
    modifier: Modifier = Modifier
) {
    Card(modifier = Modifier.background(
        color = Color.Transparent,
        shape = roundCornerShape
    )) {
        LinearProgressIndicator(
            modifier = modifier.height(15.dp),
            color = colorIndicator)

    }
}

@Preview
@Composable
fun CustomLinearProgressIndicatorPrev() {
    CustomLinearProgressIndicator(
        modifier = Modifier.fillMaxWidth().height(25.dp),
    )
}