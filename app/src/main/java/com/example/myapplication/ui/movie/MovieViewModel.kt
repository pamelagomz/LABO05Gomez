package com.example.myapplication.ui.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.MovieReviewerAppliaction
import com.example.myapplication.data.models.MovieModel
import com.example.myapplication.repository.MovieRepository

class MovieViewModel(private val repository: MovieRepository): ViewModel() {

    fun getMovie() = repository.getMovies()
    fun addMovie(movie: MovieModel) = repository.addMovie(movie)

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerAppliaction
                MovieViewModel(app.movieRespository)

            }
        }
    }
}