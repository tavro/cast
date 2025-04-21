/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.models

// import kotlinx.datetime.Instant

data class Movie(
    val id: Long,
    val title: String,
    val lengthInMinutes: Int,
    val directors: List<Director>,
    val actors: List<Actor>,
    val coverImageUrl: String?
)

data class Director(
    val id: Long,
    val name: String,
    val imageUrl: String?
)

data class Actor(
    val id: Long,
    val name: String,
    val imageUrl: String?
)

data class ViewingSession(
    val id: Long,
    val movieId: Long,
    // val startedAt: Instant,
    // val finishedAt: Instant?,
)
