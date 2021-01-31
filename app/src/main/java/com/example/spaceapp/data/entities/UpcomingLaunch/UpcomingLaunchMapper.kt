package com.example.spaceapp.data.entities.UpcomingLaunch

import com.example.spaceapp.data.entities.LaunchDTO
import com.example.spaceapp.data.entities.LaunchPadDTO
import com.example.spaceapp.data.entities.LaunchPadLocationDTO
import com.example.spaceapp.data.entities.LaunchRocketConfigurationDTO
import com.example.spaceapp.data.entities.LaunchRocketDTO
import com.example.spaceapp.data.entities.LaunchServiceProviderDTO
import com.example.spaceapp.data.entities.RocketLaunchDTO
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchPad
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchPadLocation
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchResult
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchRocket
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchRocketConfiguration
import com.example.spaceapp.domain.entities.UpcomingLaunch.LaunchServiceProvider
import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch

object UpcomingLaunchMapper {

    fun LaunchDTO.toDomain(): UpcomingLaunch {
        val launchList = results.map { it.toModel() }

        return UpcomingLaunch(upcomingLaunches = launchList)
    }

    private fun RocketLaunchDTO.toModel(): LaunchResult =
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
            infographic = infographic,
            rocket = rocket.toModel(),
            launchServiceProvider = launch_service_provider.toModel(),
            pad = pad.toModel()
        )

    private fun LaunchRocketDTO.toModel(): LaunchRocket {
        return LaunchRocket(
            id = id,
            rocketConfiguration = configuration.toModel()
        )
    }

    private fun LaunchRocketConfigurationDTO.toModel(): LaunchRocketConfiguration {
        return LaunchRocketConfiguration(
            id = id,
            launchLibraryId = launch_library_id,
            launcherConfigurationUrl = url,
            name = name,
            family = family,
            fullName = full_name,
            variant = variant
        )
    }

    private fun LaunchServiceProviderDTO.toModel(): LaunchServiceProvider {
        return LaunchServiceProvider(
            id = id,
            url = url,
            name = name,
            type = type
        )
    }

    private fun LaunchPadDTO.toModel(): LaunchPad {
        return LaunchPad(
            id = id,
            url = url,
            agencyId = agency_id,
            name = name,
            infoUrl = info_url,
            wikiUrl = wiki_url,
            mapUrl = map_url,
            latitude = latitude,
            longitude = longitude,
            location = location.toModel(),
            mapImage = map_image,
            totalLaunchCount = total_launch_count
        )
    }

    private fun LaunchPadLocationDTO.toModel(): LaunchPadLocation {
        return LaunchPadLocation(
            id = id,
            url = url,
            name = name,
            countryCode = country_code,
            mapImage = map_image,
            totalLaunchCount = total_launch_count,
            totalLandingCount = total_landing_count
        )
    }
}