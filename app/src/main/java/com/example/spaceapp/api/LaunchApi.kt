package com.example.spaceapp.api

import com.example.spaceapp.data.entities.LaunchDTO
import retrofit2.http.GET

interface LaunchApi {

    @GET("launch/upcoming")
    suspend fun getUpcomingLaunches(): LaunchDTO

}