package com.example.myapplication.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.models.MovieModel
import com.example.myapplication.databinding.MovieItemBinding



class MovieRecyclerViewHolder(private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit){
        binding.tittleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieItemCardview.setOnClickListener{
            clickListener(movie)
        }
    }
}