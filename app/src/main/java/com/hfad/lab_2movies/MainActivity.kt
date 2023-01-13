package com.hfad.lab_2movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.commit
import com.hfad.lab_2movies.dialog.AddMovieDialogFragment
import com.hfad.lab_2movies.model.Actor
import com.hfad.lab_2movies.model.Movie
import com.hfad.lab_2movies.repository.MovieRepository
import com.hfad.lab_2movies.ui.ListMoviesActivity
import com.hfad.lab_2movies.ui.MovieDetailsFragment
import com.hfad.lab_2movies.ui.MovieListFragment

class MainActivity : AppCompatActivity(), AddMovieDialogFragment.AddMovieDialogListener {
    private lateinit var btnGoToListMoviesActivity: Button
    private lateinit var button_test: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.commit {
                replace(R.id.fragment_container_view,MovieListFragment())
                setReorderingAllowed(true)
            }
        }


//        btnGoToListMoviesActivity=findViewById(R.id.btnGoToListMoviesActivity)
//
//        btnGoToListMoviesActivity.setOnClickListener {
//            startActivity(Intent(this, ListMoviesActivity::class.java))
//        }
    }

    override fun onDialogPositiveClick(
        title: String,
        description: String,
        producer: String,
        actors: String
    ) {
        val actorsList:List<Actor> =Actor.parseActors(actors,",")
        if(title.isNotBlank() && description.isNotBlank() && producer.isNotBlank() && actorsList.isNotEmpty()){
            MovieRepository.save(Movie(title,description,producer,actorsList))
            supportFragmentManager.commit {
                replace(R.id.fragment_container_view, MovieListFragment())
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        }
    }


    override fun onDialogNegativeClick(dialog: DialogFragment) {
        //TODO("Not yet implemented")

    }
}