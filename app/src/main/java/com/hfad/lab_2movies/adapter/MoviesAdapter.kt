package com.hfad.lab_2movies.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.hfad.lab_2movies.R
import com.hfad.lab_2movies.model.Movie
import com.hfad.lab_2movies.ui.MovieDetailsFragment
import com.hfad.lab_2movies.viewmodels.MovieIdViewModel

class MoviesAdapter(
    private val movieIdViewModel: MovieIdViewModel,
    private val parentFragmentManager: FragmentManager,
    private val data: MutableList<Movie>
): RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {



    class  MovieViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
         private var movieTextView:TextView
         private var currentMovie:Movie?
        var parentFragmentManager: FragmentManager? = null
            get()=field
            set(value){
                field = value
            }
        var movieIdViewModel:MovieIdViewModel? =null
            get()=field
            set(value){
                field=value
            }

        init{
            movieTextView = itemView.findViewById(R.id.movie_info)
            currentMovie=null
            itemView.setOnClickListener{
                movieIdViewModel?.setMovieId(currentMovie?.id?:-1)
                parentFragmentManager?.commit {
                    replace(R.id.fragment_container_view, MovieDetailsFragment())
                    setReorderingAllowed(true)
                    addToBackStack(null)
                }
            }

        }

        fun bind(movie:Movie){
            this.currentMovie=movie
            this.currentMovie.let {
                "${it?.id} ${it?.title} ${it?.producer}".also { movieTextView.text = it }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_movie,parent,false)
        val movieViewHolder = MovieViewHolder(view)
        movieViewHolder.parentFragmentManager=this.parentFragmentManager
        movieViewHolder.movieIdViewModel=this.movieIdViewModel
        return movieViewHolder
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}