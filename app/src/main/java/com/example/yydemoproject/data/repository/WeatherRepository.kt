package com.example.yydemoproject.data.repository

import com.example.yydemoproject.data.api.WeatherApi
import com.example.yydemoproject.data.model.Weather
import kotlinx.coroutines.withContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

class WeatherRepository {
    suspend fun getWeather(city: String) : Weather {
        delay(1000)
        return Weather(21.5, "Moscow", "Cloudy")
    }
}