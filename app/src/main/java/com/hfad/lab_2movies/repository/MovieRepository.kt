package com.hfad.lab_2movies.repository

import com.hfad.lab_2movies.dataholder.DataHolder
import com.hfad.lab_2movies.model.Movie

object MovieRepository {
    fun findAll():MutableList<Movie> = DataHolder.movies
    fun findById(movieID:Int):Movie{
        return DataHolder.movies.first { movie: Movie ->
            movie.id.equals(movieID)
        }
    }

    fun save(movie: Movie) {
        DataHolder.save(movie)
    }
}