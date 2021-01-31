package com.example.spaceapp.domain.entities.UpcomingLaunch

import java.util.Date

data class UpcomingLaunch(
    val upcomingLaunches: List<LaunchResult>
)

data class LaunchResult(
    val id: String,
    val url: String,
    val launchLibraryId: Int?,
    val slug: String,
    val name: String,
    val flightDate: Date?,
    val windowEnd: Date?,
    val windowStart: Date?,
    val isInHold: Boolean?,
    val toBeDeclaredTime: Boolean?,
    val probability: Int?,
    val holdReason: String?,
    val failReason: String?,
    val hashtag: String?,
    val webcastLive: Boolean,
    val image: String,
    val infographic: String?,
    val rocket: LaunchRocket,
    val launchServiceProvider: LaunchServiceProvider,
    val pad: LaunchPad
)

data class LaunchRocket(
    val id: Int,
    val rocketConfiguration: LaunchRocketConfiguration
)

data class LaunchRocketConfiguration(
    val id: Int,
    val launchLibraryId: Int?,
    val launcherConfigurationUrl: String,
    val name: String,
    val family: String,
    val fullName: String,
    val variant: String
)

data class LaunchServiceProvider(
    val id: Int,
    val url: String,
    val name: String,
    val type: String?
)

data class LaunchPad(
    val id: Int,
    val url: String,
    val agencyId: Int?,
    val name: String,
    val infoUrl: String?,
    val wikiUrl: String?,
    val mapUrl: String?,
    val latitude: String?,
    val longitude: String?,
    val location: LaunchPadLocation,
    val mapImage: String?,
    val totalLaunchCount: String
)

data class LaunchPadLocation(
    val id: Int,
    val url: String,
    val name: String,
    val countryCode: String,
    val mapImage: String?,
    val totalLaunchCount: String,
    val totalLandingCount: String
)