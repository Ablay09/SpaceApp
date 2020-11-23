package com.example.spaceapp.domain.repositories

import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch

interface LaunchRepository {

    suspend fun getUpcomingLaunches(): UpcomingLaunch

}