package uz.gita.repository.impl

import uz.gita.network.api.WeatherApi
import uz.gita.repository.WeatherRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepositoryImpl @Inject constructor(
    weatherApi: WeatherApi
) : WeatherRepository {

    override fun getCurrentWeather() {

    }

    override fun getFiveDayWeather() {

    }
}