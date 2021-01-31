package com.example.spaceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.spaceapp.databinding.ActivityMainBinding
import com.example.spaceapp.presentation.UpcomingLaunch.MainViewModel
import com.example.spaceapp.presentation.UpcomingLaunch.adapter.UpcomingLaunchAdapter

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel
        get() = MainViewModel()

    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var launchAdapter: UpcomingLaunchAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)
        observeViewModel()
        initRecycler()
    }

    private fun observeViewModel() {
        mainViewModel.upcomingLaunchLiveData.observe(this, {
            launchAdapter.setItems(it.upcomingLaunches)
        })
    }

    private fun initRecycler() {
        launchAdapter = UpcomingLaunchAdapter()
        viewBinding.rvUpcomingLaunch.adapter = launchAdapter
    }

}