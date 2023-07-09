package com.example.currentaffairs.di

import com.example.currentaffairs.apiResponse.ApiService
import com.example.currentaffairs.di.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
This is a Module class that will provides all dependecies we required.
 */
//@Module This annotation is used over the class which is used to construct objects
// and provide the dependencies.
@Module
//annotate Hilt modules with @InstallIn to tell Hilt which Android class each
// module will be used or installed in.
@InstallIn(SingletonComponent::class)
object module{
    @Provides
    fun provideApiService():ApiService{
        val builder=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return builder.create(ApiService::class.java)
    }
}
object Constants{
    const val BASE_URL = "https://newsapi.org"
    const val api_key = "dd5a27aa96e6435999947ed875aec407"
    const val country = "us"
    const val category = "business"

}