/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import tavro.cast.ui.components.MovieListItem

@Composable
fun WatchesScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TODO: Use real data and pass it in as a list
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
        MovieListItem(
            title = "Test Movie",
            directorName = "Test Director",
            timeStamp = "X min ago"
        )
    }
}
