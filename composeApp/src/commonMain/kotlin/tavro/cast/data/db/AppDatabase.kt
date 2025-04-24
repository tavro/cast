/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import tavro.cast.data.dao.MovieDao
import tavro.cast.data.models.Actor
import tavro.cast.data.models.Director
import tavro.cast.data.models.Movie
import tavro.cast.data.models.MovieActorCrossRef
import tavro.cast.data.models.MovieDirectorCrossRef

@Database(
    entities = [
        Movie::class,
        Director::class,
        Actor::class,
        MovieActorCrossRef::class,
        MovieDirectorCrossRef::class
    ],
    version = 1
)
abstract class CastDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}
