package com.example.yydemoproject.data.api

import com.example.yydemoproject.data.model.Weather
import retrofit2.http.GET

interface WeatherApi {
    @GET("v1/forecast?latitude=52.52&longitude=13.41&current_weather=true")
    suspend fun getWeather() : Weather
}