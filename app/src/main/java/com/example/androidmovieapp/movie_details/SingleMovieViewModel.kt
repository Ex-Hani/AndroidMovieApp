package com.example.androidmovieapp.movie_details

import android.arch.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.androidmovieapp.data.entities.MovieDetails
import com.example.androidmovieapp.data.repository.NetworkState
import io.reactivex.disposables.CompositeDisposable
import kotlin.reflect.KProperty

class SingleMovieViewModel(private val movieRepository: MovieDetailsRepository, movieId: Int) :
    ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    val movieDetails by lazy {
        movieRepository.fetchSingleMovieDetails(compositeDisposable,movieId)
    }

    val networkState by lazy {
        movieRepository.getMovieDetailsNetworkState()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }


}

