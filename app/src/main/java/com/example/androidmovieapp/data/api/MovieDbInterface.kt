package com.example.androidmovieapp.data.api

import com.example.androidmovieapp.data.entities.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieDbInterface {

    // https://api.themoviedb.org/3/movie/popular?api_key=d67954ab5e8684544e0ad66dd8617262
    // https://api.themoviedb.org/3/movie/299534?api_key=d67954ab5e8684544e0ad66dd8617262
    // https://api.themoviedb.org/3/

    //@GET("movie/popular")
    //fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>
}