/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package org.example.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun SettingsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(16.dp, 8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(48.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Profile Picture"
            )
            Column {
                Text(
                    text = "Username",
                    color = Color.White
                )
                Text(
                    text = "x Watches",
                    color = Color.Gray
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Service Logo"
            )
            Text(
                text = "Netflix",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Service Logo"
            )
            Text(
                text = "Disney+",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Service Logo"
            )
            Text(
                text = "Hulu",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Service Logo"
            )
            Text(
                text = "Amazon Prime Video",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Service Logo"
            )
            Text(
                text = "YouTube Premium",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Service Logo"
            )
            Text(
                text = "HBO Max",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Service Logo"
            )
            Text(
                text = "Discovery+",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Backup Data",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "About",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Terms of service",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Privacy Policy",
                color = Color.White
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Sign out",
                color = Color.White
            )
        }
    }
}
