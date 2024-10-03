package com.plcoding.weatherapp.presentation

import com.plcoding.weatherapp.domain.weather.weatherInfo

data class WeatherState(
    val weatherInfo: weatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
