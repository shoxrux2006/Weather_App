package uz.gita.data.models.fivedayweather

import com.example.weatherapp.service.dataclasses.Coord

data class City(
    val id: Int,
    val name: String,
    val coord: Coord,
    val county: String,
    val population: Int,
    val timezone: Int,
    val sunrise: Int,
    val sunset: Int
)
