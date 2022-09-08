package uz.gita.domain.usecase.impl

import uz.gita.domain.usecase.LocationUseCase
import uz.gita.repository.LocationRepository
import javax.inject.Inject

class LocationUseCaseImpl @Inject constructor(
    private val locationRepository: LocationRepository
) : LocationUseCase {

}