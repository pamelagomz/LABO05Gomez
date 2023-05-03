package com.example.myapplication.ui.movie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.MovieReviewerAppliaction
import com.example.myapplication.data.models.MovieModel
import com.example.myapplication.repository.MovieRepository
import kotlin.contracts.Returns

class MovieViewModel(private val repository: MovieRepository): ViewModel() {

    var name = MutableLiveData("")
    var category = MutableLiveData("")
    var description = MutableLiveData("")
    var qualification = MutableLiveData("")

    var status = MutableLiveData("")


    fun getMovie() = repository.getMovies()
    fun addMovie(movie: MovieModel) = repository.addMovie(movie)

    fun createMovie(){
        if(!validateData()){
            status.value = WRONG_DATA
            return
        }

        val newMovie = MovieModel(
            name.value.toString(),
            category.value.toString(),
            description.value.toString(),
            qualification.value.toString()
        )

        addMovie(newMovie)
        status.value = MOVIE_CREATED
    }

    private fun validateData(): Boolean{
        when {
            name.value.isNullOrEmpty() -> return false
            category.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
            qualification.value.isNullOrEmpty() -> return false
        }
        return true
    }

     fun clearData() {
        name.value = ""
        category.value = ""
        description.value = ""
        qualification.value = ""
    }

     fun clearStatus(){
        status.value = BASE_STATE
    }

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerAppliaction
                MovieViewModel(app.movieRespository)

            }
        }

        const val MOVIE_CREATED = "Movie created "
        const val WRONG_DATA ="Wrong information"
        const val BASE_STATE = ""

    }


}