package com.plcoding.weatherapp.domain.weather

data class weatherInfo(
    val weatherDataPerDay : Map<Int,List<WeatherData>>,
    val currentWeatherData : WeatherData?

)
