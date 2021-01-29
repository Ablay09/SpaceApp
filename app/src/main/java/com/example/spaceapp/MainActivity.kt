package com.example.spaceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.spaceapp.databinding.ActivityMainBinding
import com.example.spaceapp.presentation.UpcomingLaunch.MainViewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel
        get() = MainViewModel()

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)
        observeViewModel()
    }

    private fun observeViewModel() {
        mainViewModel.upcomingLaunchLiveData.observe( this, {

        })
    }

}