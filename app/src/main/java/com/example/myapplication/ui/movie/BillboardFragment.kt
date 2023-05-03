package com.example.myapplication.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentBillboardBinding
import com.example.myapplication.databinding.FragmentCreateMovieBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class BillboardFragment : Fragment() {


    private lateinit var binding : FragmentBillboardBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBillboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.actionMovieBtn.setOnClickListener(){

            it.findNavController().navigate(R.id.action_billboardFragment_to_createMovieFragment)

        }

        binding.cardView.setOnClickListener {
            it.findNavController().navigate(R.id.action_billboardFragment_to_movieFragment2)
        }

    }


}
