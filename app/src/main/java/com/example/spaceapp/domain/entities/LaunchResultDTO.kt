package com.example.spaceapp.domain.entities

import java.util.Date

data class LauncObjectDTO(
        val count: Int,
        val next: String?,
        val previous: String?,
        val results: List<LaunchResultDTO>
)

data class LaunchResultDTO(
        val id: String,
        val url: String,
        val launch_library_id: Int?,
        val slug: String,
        val name: String,
        val status: LaunchStatusDTO,
        val net: Date?,
        val window_end: Date?,
        val window_start: Date?,
        val inhold: Boolean?,
        val tbdtime: Boolean?,
        val probability: Int?,
        val holdreason: String?,
        val failreason: String?,
        val hashtag: String?,
        val launch_service_provider: LaunchServiceProviderDTO,
        val rocket: LaunchRocketDTO,
        val mission: LaunchMissionDTO,
        val pad: LaunchPadDTO,
        val infoURLs: String,
        val vidURLs: String,
        val webcast_live: Boolean,
        val image: String,
        val infographic: String,
        val program: List<LaunchProgramDTO>
)

data class LaunchStatusDTO(
        val id: String,
        val name: String
)

data class LaunchServiceProviderDTO(
        val id: Int,
        val url: String,
        val name: String,
        val type: String?
)

data class LaunchRocketDTO(
        val id: Int,
        val configuration: LaunchRocketConfigurationDTO
)

data class LaunchRocketConfigurationDTO(
        val id: Int,
        val launch_library_id: Int?,
        val url: String,
        val name: String,
        val family: String,
        val full_name: String,
        val variant: String
)

data class LaunchMissionDTO(
        val id: Int,
        val launch_library_id: Int?,
        val name: String,
        val description: String,
        val launch_designator: String?,
        val type: String,
        val orbit: LaunchMissionOrbitDTO
)

data class LaunchMissionOrbitDTO(
        val id: Int,
        val name: String,
        val abbrev: String
)

data class LaunchPadDTO(
        val id: Int,
        val url: String,
        val agency_id: Int?,
        val name: String,
        val info_url: String?,
        val wiki_url: String?,
        val map_url: String?,
        val latitude: String?,
        val longitude: String?,
        val location: LaunchPadLocationDTO,
        val map_image: String?,
        val total_launch_count: String
)

data class LaunchPadLocationDTO(
        val id: Int,
        val url: String,
        val name: String,
        val country_code: String,
        val map_image: String?,
        val total_launch_count: String,
        val total_landing_count: String
)

data class LaunchProgramDTO(
        val id: Int,
        val url: String,
        val name: String,
        val description: String?,
        val agencies: List<LaunchProgramAgencyDTO>,
        val image_url: String,
        val start_date: Date?,
        val end_date: Date?,
        val info_url: String?,
        val wiki_url: String?
)

data class LaunchProgramAgencyDTO(
        val id: Int,
        val url: String,
        val name: String,
        val type: String?
)