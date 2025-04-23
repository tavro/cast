/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.data.models

// import androidx.room.vo.Entity
// import androidx.room.vo.PrimaryKey

// @Entity
data class Movie(
    /* @PrimaryKey */ val id: Long,
    val title: String,
    val lengthInMinutes: Int,
    val directors: List<Director>,
    val actors: List<Actor>,
    val coverImageUrl: String?
)

// @Entity
data class Director(
    /* @PrimaryKey */ val id: Long,
    val name: String,
    val imageUrl: String?
)

// @Entity
data class Actor(
    /* @PrimaryKey */ val id: Long,
    val name: String,
    val imageUrl: String?
)
