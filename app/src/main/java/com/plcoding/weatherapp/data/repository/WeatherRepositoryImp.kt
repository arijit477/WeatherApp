package com.plcoding.weatherapp.data.repository

import com.plcoding.weatherapp.data.mappers.toWeatherInfo
import com.plcoding.weatherapp.data.remote.WeatherApi
import com.plcoding.weatherapp.domain.repository.WeatherRepository
import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.weatherInfo
import javax.inject.Inject

class WeatherRepositoryImp @Inject constructor(
    private val api : WeatherApi
):WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<weatherInfo> {
       return try {
           Resource.Success(
               data = api.getWeatherData(
                   lat = lat,
                   long = long
               ).toWeatherInfo()
           )
       }catch (e:Exception){
           e.printStackTrace()
           Resource.Error(e.message ?: "An Unknown Error Occured." )

       }
    }
}