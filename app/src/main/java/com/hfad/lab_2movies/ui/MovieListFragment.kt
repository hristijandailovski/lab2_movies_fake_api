package com.hfad.lab_2movies.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import com.hfad.lab_2movies.R
import com.hfad.lab_2movies.adapter.MoviesAdapter
import com.hfad.lab_2movies.databinding.FragmentMovieListBinding
import com.hfad.lab_2movies.dialog.AddMovieDialogFragment
import com.hfad.lab_2movies.repository.MovieRepository
import com.hfad.lab_2movies.viewmodels.MovieIdViewModel


class MovieListFragment : Fragment(R.layout.fragment_movie_list) {
    private var _binding:FragmentMovieListBinding? =null
    private val binding get() = _binding!!
    private val movieIdViewModel:MovieIdViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMovieListBinding.bind(view)

        binding.btnToDialogFragment.setOnClickListener {
            AddMovieDialogFragment().show(childFragmentManager,"add-movie-dialog")
        }
        binding.listMoviesView.adapter = MoviesAdapter(movieIdViewModel,parentFragmentManager,MovieRepository.findAll())

    }


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
//        return inflater.inflate(R.layout.fragment_movie_list, container, false)
//    }
}