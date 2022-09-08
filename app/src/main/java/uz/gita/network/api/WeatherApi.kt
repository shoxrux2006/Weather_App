package uz.gita.network.api

import retrofit2.Response
import retrofit2.http.GET

interface WeatherApi {

    @GET("")
    suspend fun get(): Response<Unit>

}