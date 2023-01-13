package com.hfad.lab_2movies.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.hfad.lab_2movies.R
import com.hfad.lab_2movies.adapter.MoviesAdapter
import com.hfad.lab_2movies.repository.MovieRepository

class ListMoviesActivity : AppCompatActivity() {
    private lateinit var listView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_list_movies)
//
//
//        listView=findViewById(R.id.listMoviesView)
//        listView.adapter = MoviesAdapter(MovieRepository.findAll())

    }
}