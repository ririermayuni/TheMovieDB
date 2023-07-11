package com.example.themoviedb.service

import com.example.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_kay=cccbbdf1921c36e027da532005b636da")
    fun getTVList(): Call<TVResponse>
}