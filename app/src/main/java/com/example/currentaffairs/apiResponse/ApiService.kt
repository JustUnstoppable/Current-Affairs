package com.example.currentaffairs.apiResponse

import com.example.currentaffairs.apiResponse.ResponseDTO
import retrofit2.http.GET
import retrofit2.http.Query

//This is API interface ,it will help for API calling ,I am passing country,category and api key as query parameter
interface ApiService {
    @GET("v2/top-headlines")
    //a function that can be paused and resumed at a later time. They can execute a long running operation and wait for it to complete without blocking.
    suspend fun getNews(
        @Query("country") country:String,
        @Query("category") category:String,
        @Query("apiKey") apiKey:String
    ): ResponseDTO

}