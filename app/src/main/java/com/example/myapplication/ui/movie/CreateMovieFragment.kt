package com.example.myapplication.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.data.models.MovieModel
import com.example.myapplication.databinding.FragmentCreateMovieBinding


class CreateMovieFragment : Fragment() {

    private lateinit var binding: FragmentCreateMovieBinding

    private val viewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_create_movie, container, false)

        binding = FragmentCreateMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
        setObserver()


    }

    private fun setViewModel() {
        binding.viewmodel = viewModel
    }

    private fun setObserver() {
        viewModel.status.observe(viewLifecycleOwner){status ->
            when {
                status.equals(MovieViewModel.MOVIE_CREATED)->{
                    Log.d("APP TAG", status)
                    Log.d("APP TAG",viewModel.getMovie().toString())


                    viewModel.clearStatus()
                    viewModel.clearData()
                    findNavController().popBackStack()
                }
                status.equals(MovieViewModel.WRONG_DATA)->{
                    Log.d("TAG APP", status)
                    viewModel.clearStatus()
                }
            }

        }
    }

    companion object{
        const val APP_TAG = "APP TAG"
    }


}




//        Log.d("TAG APP", viewModel.getMovie().toString())
//
//        findNavController().popBackStack()

//val newMovie =  MovieModel(
//            binding.inputName.text.toString(),
//            binding.inputCategory.text.toString(),
//            binding.inputDescription.text.toString(),
//            binding.inputCalificacion.text.toString()
//
//        )