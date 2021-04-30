package com.example.android_starter.network

import com.example.android_starter.db.Example
import retrofit2.http.GET

const val BASE_URL = "https://google.com"

interface WebService {

    @GET("/api/stuff")
    suspend fun get(): List<Example>

}