/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import tavro.cast.data.models.Actor
import tavro.cast.data.models.Director
import tavro.cast.data.models.Movie
import kotlin.random.Random

/*
TODO:

- Initially Shown Fields: MovieTitle
- When user fills in title:
    - If movie exists in IMDB, show (top five results) in dropdown
        - When clicked, autofill data
    - If movie does not exists in IMDB, show alternative to add manually
        - When clicked, show fields:
            - CoverImageUrl,
            - LengthInMinutes,
            - Director/Directors
            - Actors (dynamically added fields + optional)
- When user clicks 'Add movie'-button:
    - Fetch Directors and Actors data and create instances
    - Create Instance of movie and store in data store
    - Create ViewingSession instance and store in data store
 */

@Composable
fun AddMovieScreen() {
    MovieInputForm { movie ->
        println("Movie created: $movie") // TODO: Store in database
    }
}

@Composable
fun MovieInputForm(onSave: (Movie) -> Unit) {
    var title by remember { mutableStateOf("") }
    var length by remember { mutableStateOf("") }
    var coverImageUrl by remember { mutableStateOf("") }

    var directors by remember { mutableStateOf(listOf<Director>()) }
    var newDirectorName by remember { mutableStateOf("") }
    var newDirectorImageUrl by remember { mutableStateOf("") }

    var actors by remember { mutableStateOf(listOf<Actor>()) }
    var newActorName by remember { mutableStateOf("") }
    var newActorImageUrl by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp).background(color = Color.White)) {
        TextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = length,
            onValueChange = { length = it.filter { it.isDigit() } },
            label = { Text("Length (minutes)") }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = coverImageUrl,
            onValueChange = { coverImageUrl = it },
            label = { Text("Cover Image URL") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text("Directors")
        LazyColumn {
            items(directors) {
                Text("- ${it.name}")
            }
        }
        TextField(
            value = newDirectorName,
            onValueChange = { newDirectorName = it },
            label = { Text("Director Name") }
        )
        TextField(
            value = newDirectorImageUrl,
            onValueChange = { newDirectorImageUrl = it },
            label = { Text("Director Image URL") }
        )
        Button(onClick = {
            if (newDirectorName.isNotBlank()) {
                directors = directors + Director(
                    id = Random.nextLong(), // NOTE: Temporary
                    name = newDirectorName,
                    imageUrl = newDirectorImageUrl.takeIf { it.isNotBlank() }
                )
                newDirectorName = ""
                newDirectorImageUrl = ""
            }
        }) {
            Text("Add Director")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("Actors")
        LazyColumn {
            items(actors) {
                Text("- ${it.name}")
            }
        }
        TextField(
            value = newActorName,
            onValueChange = { newActorName = it },
            label = { Text("Actor Name") }
        )
        TextField(
            value = newActorImageUrl,
            onValueChange = { newActorImageUrl = it },
            label = { Text("Actor Image URL") }
        )
        Button(onClick = {
            if (newActorName.isNotBlank()) {
                actors = actors + Actor(
                    id = Random.nextLong(), // NOTE: Temporary
                    name = newActorName,
                    imageUrl = newActorImageUrl.takeIf { it.isNotBlank() }
                )
                newActorName = ""
                newActorImageUrl = ""
            }
        }) {
            Text("Add Actor")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {
            if (title.isNotBlank() && length.isNotBlank()) {
                onSave(
                    Movie(
                        id = Random.nextLong(), // NOTE: Temporary
                        title = title,
                        lengthInMinutes = length.toInt(),
                        directors = directors,
                        actors = actors,
                        coverImageUrl = coverImageUrl.takeIf { it.isNotBlank() }
                    )
                )
            }
        }) {
            Text("Save Movie")
        }
    }
}
