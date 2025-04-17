package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import tavro.cast.components.BottomNavigationBar
import tavro.cast.components.MovieListItem
import tavro.cast.components.TabHeader

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxWidth()) {
            TabHeader(activeTab = "Watches")
            Column(Modifier.fillMaxWidth().weight(1.0f), horizontalAlignment = Alignment.CenterHorizontally) {
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
            BottomNavigationBar()
        }
    }
}