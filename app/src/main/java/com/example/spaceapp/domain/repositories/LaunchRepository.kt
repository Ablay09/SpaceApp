package com.example.spaceapp.domain.repositories

import com.example.spaceapp.domain.entities.LaunchDTO

interface LaunchRepository {

    suspend fun getUpcomingLaunches(): LaunchDTO

}