/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cast.composeapp.generated.resources.Res
import cast.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
fun CarouselItem(title: String, supportingText: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.background(Color.Black).padding(8.dp)) {
        Image(
            modifier = Modifier.size(128.dp),
            painter = painterResource(Res.drawable.compose_multiplatform),
            contentDescription = "Carousel Item Image"
        )
        Text(
            text = title,
            color = Color.White
        )
        Text(
            text = supportingText,
            color = Color.Gray
        )
    }
}
