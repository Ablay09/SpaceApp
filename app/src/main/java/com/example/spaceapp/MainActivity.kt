package com.example.spaceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.spaceapp.api.LaunchApi
import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch
import com.example.spaceapp.presentation.UpcomingLaunch.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel
        get() = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeViewModel()
    }

    private fun observeViewModel() {
        mainViewModel.upcomingLaunchLiveData.observe( this, {

        })
    }

}