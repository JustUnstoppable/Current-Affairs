package com.example.currentaffairs.apiResponse

data class ResponseDTO(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)