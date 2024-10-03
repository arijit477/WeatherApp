package com.plcoding.weatherapp.domain.repository

import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.weatherInfo
import retrofit2.http.GET

interface WeatherRepository {

    suspend fun getWeatherData(lat:Double , long:Double):Resource<weatherInfo>

    }
