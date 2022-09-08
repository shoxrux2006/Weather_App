package com.example.weatherapp.service.dataclasses.currentweather

import com.example.weatherapp.service.dataclasses.*
import uz.gita.data.models.currentWeather.Sys

data class WeatherResponse(
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    val visibility: Int,
    val wind: Wind,
    val clouds: Clouds,
    val dt: Int,
    val sys: Sys,
    val timezone: Int,
    val id: Int,
    val name: String,
    val cod: Int
)