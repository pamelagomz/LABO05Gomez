package com.example.myapplication

import android.app.Application
import com.example.myapplication.data.movies
import com.example.myapplication.repository.MovieRepository

class MovieReviewerAppliaction: Application() {

    val movieRespository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}

