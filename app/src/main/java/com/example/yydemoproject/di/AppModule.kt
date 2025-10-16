package com.example.yydemoproject.di

import com.example.yydemoproject.data.api.WeatherApi
import com.example.yydemoproject.data.repository.WeatherRepository
import com.example.yydemoproject.viewmodel.WeatherViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single { OkHttpClient() }

    // Retrofit и API
    single {
        Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<WeatherApi> {
        get<Retrofit>().create(WeatherApi::class.java)
    }

    // Репозиторий
    single { WeatherRepository() }

    // ViewModel
    viewModel { WeatherViewModel(get()) }
}