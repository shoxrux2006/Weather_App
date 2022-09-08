package uz.gita.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.repository.LocationRepository
import uz.gita.repository.impl.LocationRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun bindLocationRepository(impl: LocationRepositoryImpl): LocationRepository

}