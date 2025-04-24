/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val title: String,
    val lengthInMinutes: Int,
    val coverImageUrl: String?
)

@Entity
data class Director(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    val imageUrl: String?
)

@Entity
data class Actor(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    val imageUrl: String?
)

@Entity(primaryKeys = ["movieId", "directorId"])
data class MovieDirectorCrossRef(
    val movieId: Long,
    val directorId: Long
)

@Entity(primaryKeys = ["movieId", "actorId"])
data class MovieActorCrossRef(
    val movieId: Long,
    val actorId: Long
)

/*
data class MovieWithDirectorsAndActors(
    @Embedded val movie: Movie,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(MovieDirectorCrossRef::class)
    )
    val directors: List<Director>,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(MovieActorCrossRef::class)
    )
    val actors: List<Actor>
)
*/
