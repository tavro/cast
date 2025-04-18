/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Carousel(
    title: String,
    items: List<@Composable () -> Unit>,
    modifier: Modifier = Modifier,
    onSeeMoreClick: () -> Unit = {}
) {
    Column(modifier = modifier.background(Color.Black).padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "${items.size} $title",
                color = Color.White
            )
            Text(
                text = "See more",
                color = Color.Cyan,
                modifier = Modifier.clickable { onSeeMoreClick() }
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow {
            items(items.size) { index ->
                items[index]()
            }
        }
    }
}
