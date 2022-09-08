package uz.gita.network.api

import com.example.weatherapp.service.dataclasses.currentweather.WeatherResponse
import com.example.weatherapp.service.dataclasses.fivedayweather.FiveDayWeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getCurrentWeather(
        @Query("q") q: String,
        @Query("units") units: String,
        @Query("lang") lang: String,
        @Query("appid") appId: String
    ): Response<WeatherResponse>

    @GET("forecast")
    suspend fun getFiveDayWeather(
        @Query("q") q: String,
        @Query("units") units: String,
        @Query("lang") lang: String,
        @Query("appid") appId: String
    ): Response<FiveDayWeatherResponse>

}