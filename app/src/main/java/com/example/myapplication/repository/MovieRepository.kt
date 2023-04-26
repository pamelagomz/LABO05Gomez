package com.example.myapplication.repository

import com.example.myapplication.data.models.MovieModel

class MovieRepository(private val movies:MutableList<MovieModel> ) {

    fun getMovies() = movies

    fun addMovie(newMovie: MovieModel) = movies.add(newMovie)

}