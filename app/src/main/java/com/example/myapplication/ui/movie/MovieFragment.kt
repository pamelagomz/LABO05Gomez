package com.example.myapplication.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentCreateMovieBinding
import com.example.myapplication.databinding.FragmentMovieBinding


class MovieFragment : Fragment() {

    private lateinit var binding : FragmentMovieBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_movie, container, false)

        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }


}