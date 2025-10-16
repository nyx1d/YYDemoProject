package com.example.yydemoproject.viewmodel

import com.example.yydemoproject.data.repository.WeatherRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yydemoproject.data.model.Weather
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class WeatherViewModel(private val repository: WeatherRepository) : ViewModel() {
        private val _weather = MutableStateFlow(Weather(0.0, "Moscow", "Loading..."))
        val weather: StateFlow<Weather> = _weather

        init {
            viewModelScope.launch {
                try {
                    val data = repository.getWeather("Berlin")
                    _weather.value = data
                } catch (e: Exception) {
                    _weather.value = Weather(0.0, "Moscow", "Error: ${e.message}")
                }
            }
        }
}