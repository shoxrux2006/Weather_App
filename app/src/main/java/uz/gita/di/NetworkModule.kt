package uz.gita.di

import com.chuckerteam.chucker.api.ChuckerInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.gita.App.App
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @[Provides Singleton]
    fun provideHttpLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    @[Provides Singleton]
    fun provideChuckerInterceptor() =
        ChuckerInterceptor.Builder(App.instance).build()

    @[Provides Singleton]
    fun provideHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        chuckerInterceptor: ChuckerInterceptor
    ) = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .addInterceptor(chuckerInterceptor)
        .build()

    @[Provides Singleton Named("Geo")]
    fun provideGeoRetrofit(client: OkHttpClient) =
        Retrofit.Builder().baseUrl("http://api.openweathermap.org/geo/1.0/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

    @[Provides Singleton Named("Weather")]
    fun provideWeatherRetrofit(client: OkHttpClient) =
        Retrofit.Builder().baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()


}