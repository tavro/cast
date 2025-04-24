/*
 * Original code written by Isak/Tyson Horvath for the Cast project.
 *
 * Copyright (c) 2025 Isak/Tyson Horvath
 * Licensed under the MIT License.
 */

package tavro.cast.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import tavro.cast.data.models.Actor
import tavro.cast.data.models.Director
import tavro.cast.data.models.Movie
import tavro.cast.data.models.MovieActorCrossRef
import tavro.cast.data.models.MovieDirectorCrossRef

@Dao
interface MovieDao {
    @Transaction
    @Query("SELECT * FROM Movie")
    fun getAllMovies(): Flow<List<Movie>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: Movie)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertActor(actor: Actor)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovieDirectorCrossRef(crossRef: MovieDirectorCrossRef)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovieActorCrossRef(crossRef: MovieActorCrossRef)
}
