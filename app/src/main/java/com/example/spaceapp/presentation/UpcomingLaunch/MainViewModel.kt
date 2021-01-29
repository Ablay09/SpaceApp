package com.example.spaceapp.presentation.UpcomingLaunch

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spaceapp.ApiClient
import com.example.spaceapp.api.LaunchApi
import com.example.spaceapp.core.CoroutineContextProviderImpl
import com.example.spaceapp.data.repositories.LaunchRepositoryImpl
import com.example.spaceapp.domain.entities.UpcomingLaunch.UpcomingLaunch
import com.example.spaceapp.domain.usecases.GetUpcomingLaunchUseCase
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class MainViewModel : ViewModel() {

    private val retrofit: Retrofit = ApiClient.getClient()
    private val launchApi: LaunchApi = retrofit.create(LaunchApi::class.java)

    private val launchRepositoryImpl: LaunchRepositoryImpl
        get() = LaunchRepositoryImpl(launchApi = launchApi)

    private val getUpcomingLaunchUseCase: GetUpcomingLaunchUseCase
        get() = GetUpcomingLaunchUseCase(launchRepository = launchRepositoryImpl)

    private val coroutineContextProvider
        get() = CoroutineContextProviderImpl()

    val upcomingLaunchLiveData: LiveData<UpcomingLaunch>
        get() = _upcomingLaunchLiveData
    private val _upcomingLaunchLiveData = MutableLiveData<UpcomingLaunch>()

    init {
        getUpcomingLaunch()
    }

    private fun getUpcomingLaunch() {
        viewModelScope.launch {
            val result: UpcomingLaunch = withContext(coroutineContextProvider.io) {
                getUpcomingLaunchUseCase.invoke()
            }
            _upcomingLaunchLiveData.value = result
        }
    }
}