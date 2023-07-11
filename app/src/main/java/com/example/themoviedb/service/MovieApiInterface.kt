package com.example.themoviedb.service

import com.example.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_kay=cccbbdf1921c36e027da532005b636da")
    fun getMovieList(): Call<MovieResponse>
}