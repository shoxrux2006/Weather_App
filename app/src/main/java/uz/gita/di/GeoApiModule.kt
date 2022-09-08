package uz.gita.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import uz.gita.network.api.LocationApi
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
interface GeoApiModule {

    @Provides
    fun provideLocationApi(@Named("Geo") retrofit: Retrofit): LocationApi = retrofit.create(LocationApi::class.java)

}