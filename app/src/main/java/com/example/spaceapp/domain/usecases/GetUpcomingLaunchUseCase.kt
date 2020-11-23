package com.example.spaceapp.domain.usecases

import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch
import com.example.spaceapp.domain.repositories.LaunchRepository

class GetUpcomingLaunchUseCase(private val launchRepository: LaunchRepository) {

    suspend operator fun invoke(): UpcomingLaunch {
        return launchRepository.getUpcomingLaunches()
    }
}