package uz.gita.repository.impl

import uz.gita.data.source.LocalStorage
import uz.gita.network.api.LocationApi
import uz.gita.repository.LocationRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocationRepositoryImpl @Inject constructor(
    locationApi: LocationApi,
    localStorage: LocalStorage
) : LocationRepository

