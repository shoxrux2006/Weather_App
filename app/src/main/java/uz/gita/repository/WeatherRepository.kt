package uz.gita.repository

import java.util.concurrent.Flow

interface WeatherRepository {

    suspend fun getCurrentWeather()
    suspend fun getFiveDayWeather()

}