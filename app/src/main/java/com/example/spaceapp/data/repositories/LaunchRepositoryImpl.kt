package com.example.spaceapp.data.repositories

import com.example.spaceapp.api.LaunchApi
import com.example.spaceapp.data.entities.UpcomingLaunch.UpcomingLaunchMapper.toDomain
import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch
import com.example.spaceapp.domain.repositories.LaunchRepository

class LaunchRepositoryImpl(private val launchApi: LaunchApi): LaunchRepository {

    override suspend fun getUpcomingLaunches(): UpcomingLaunch {
        return launchApi.getUpcomingLaunches().toDomain()
    }
}