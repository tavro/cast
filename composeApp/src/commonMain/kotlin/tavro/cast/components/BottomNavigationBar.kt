/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cast.composeapp.generated.resources.Res
import cast.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomNavigationBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp, 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // TODO: Make all columns the same size
        Column {
            Image(
                modifier = Modifier.size(48.dp).align(Alignment.CenterHorizontally),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Navigation Tab Icon"
            )
            Text(
                text = "Watches",
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Image(
                modifier = Modifier.size(48.dp).align(Alignment.CenterHorizontally),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Navigation Tab Icon"
            )
            Text(
                text = "Reports",
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Image(
                modifier = Modifier.size(48.dp).align(Alignment.CenterHorizontally),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Navigation Tab Icon"
            )
            Text(
                text = "Library",
                color = Color.White
            )
        }
    }
}