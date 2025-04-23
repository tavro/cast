/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cast.composeapp.generated.resources.Res
import cast.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.ui.tooling.preview.Preview
import tavro.cast.ui.components.BottomNavigationBar
import tavro.cast.ui.components.BottomNavigationItem
import tavro.cast.ui.components.TabHeader

@Composable
@Preview
fun App() {
    val tabs = listOf(
        BottomNavigationItem("Watches", Res.drawable.compose_multiplatform),
        BottomNavigationItem("Reports", Res.drawable.compose_multiplatform),
        BottomNavigationItem("Library", Res.drawable.compose_multiplatform),
        BottomNavigationItem("Add", Res.drawable.compose_multiplatform),
        BottomNavigationItem("Settings", Res.drawable.compose_multiplatform)
    )
    var selectedTab by remember { mutableStateOf(0) }

    MaterialTheme {
        Scaffold(
            topBar = {
                TabHeader(activeTab = tabs[selectedTab].label)
            },
            bottomBar = {
                BottomNavigationBar(
                    items = tabs,
                    selectedIndex = selectedTab,
                    onItemSelected = { index ->
                        selectedTab = index
                    }
                )
            }
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(color = Color.Black)
            ) {
                when (selectedTab) {
                    0 -> WatchesScreen()
                    1 -> ReportsScreen()
                    2 -> LibraryScreen()
                    3 -> AddMovieScreen()
                    4 -> SettingsScreen()
                }
            }
        }
    }
}
