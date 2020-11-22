package com.example.spaceapp.data.repositories

import com.example.spaceapp.api.LaunchApi
import com.example.spaceapp.domain.entities.LaunchDTO
import com.example.spaceapp.domain.repositories.LaunchRepository

class LaunchRepositoryImpl(
    private val launchApi: LaunchApi
): LaunchRepository {

    override suspend fun getUpcomingLaunches(): LaunchDTO {
        return launchApi.getUpcomingLaunches()
    }
}