package com.hfad.lab_2movies.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieIdViewModel:ViewModel() {
    private val mutableMovieId = MutableLiveData<Int>()
    val movieId: LiveData<Int> get() = mutableMovieId

    fun setMovieId(movieId:Int) {
        mutableMovieId.value = movieId
    }
}