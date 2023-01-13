package com.hfad.lab_2movies.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import com.hfad.lab_2movies.R
import com.hfad.lab_2movies.databinding.FragmentMovieDetailsBinding
import com.hfad.lab_2movies.model.Movie
import com.hfad.lab_2movies.repository.MovieRepository
import com.hfad.lab_2movies.viewmodels.MovieIdViewModel


class MovieDetailsFragment : Fragment(R.layout.fragment_movie_details) {
    private var _binding: FragmentMovieDetailsBinding?=null
    private val binding get()=_binding!!
    private val movieIdViewModel:MovieIdViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentMovieDetailsBinding.bind(view)
        movieIdViewModel.movieId.observe(viewLifecycleOwner){
            val movie: Movie = MovieRepository.findById(it)



            binding.movieDetailsTextView.text= movie.getDetails()
        }

    }

//TODO: Movie id view model e potpolnet, zemi go id-to i najdi go filmot vo repozitoriumot, i isprintaj gi detalite

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_movie_details, container, false)
//    }



}