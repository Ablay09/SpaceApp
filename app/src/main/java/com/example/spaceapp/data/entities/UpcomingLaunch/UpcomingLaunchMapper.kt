package com.example.spaceapp.data.entities.UpcomingLaunch

import com.example.spaceapp.data.entities.LaunchDTO
import com.example.spaceapp.data.entities.RocketLaunchDTO
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchResult
import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch

object UpcomingLaunchMapper {

    fun LaunchDTO.toDomain(): UpcomingLaunch {
        val launchList = results.map {
            it.toDomain()
        }

        return UpcomingLaunch(upcomingLaunches = launchList)
    }

    private fun RocketLaunchDTO.toDomain(): LaunchResult =
        LaunchResult(
            id = id,
            url = url,
            launchLibraryId = launch_library_id,
            slug = slug,
            name = name,
            flightDate = net,
            windowEnd = window_end,
            windowStart = window_start,
            isInHold = inhold,
            toBeDeclaredTime = tbdtime,
            probability = probability,
            holdReason = holdreason,
            failReason = failreason,
            hashtag = hashtag,
            webcastLive = webcast_live,
            image = image,
            infographic = infographic
        )
}