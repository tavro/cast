/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import tavro.cast.components.Carousel
import tavro.cast.components.CarouselItem

@Composable
fun LibraryScreen() {
    val movieCarouselItems = listOf<@Composable () -> Unit>(
        {
            CarouselItem("Movie", "X Watches")
        }
    )

    val directorCarouselItems = listOf<@Composable () -> Unit>(
        {
            CarouselItem("Director Directorson", "X Watches")
        }
    )

    val actorCarouselItems = listOf<@Composable () -> Unit>(
        {
            CarouselItem("Actor 1", "X Watches")
        },
        {
            CarouselItem("Actor 2", "X Watches")
        },
        {
            CarouselItem("Actor 3", "X Watches")
        }
    )

    Column {
        Carousel(title = "Movies", items = movieCarouselItems)
        Carousel(title = "Directors", items = directorCarouselItems)
        Carousel(title = "Actors", items = actorCarouselItems)
    }
}
