package uz.gita.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.domain.usecase.LocationUseCase
import uz.gita.domain.usecase.impl.LocationUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @Binds
    fun bindLocationUseCase(impl: LocationUseCaseImpl): LocationUseCase

}