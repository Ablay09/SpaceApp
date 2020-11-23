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
    val infographic: String
)