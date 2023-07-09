package com.example.currentaffairs

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.bumptech.glide.load.engine.Resource
import com.example.currentaffairs.apiResponse.ResponseDTO
import okhttp3.Dispatcher
import javax.inject.Inject

//Letting the Activity do the data handling isn’t a good idea. A ViewModel provides a way to create and retrieve objects.
// It typically stores the state of a view’s data and communicates with other components.
class NewsViewModel @Inject constructor(val repository:Repository): ViewModel(){
    fun getDataFromApi(): LiveData<Resource<ResponseDTO>>{
        return liveData(Dispatcher.IO) {  }
    }

}