package com.example.spaceapp.core

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface CoroutineContextProvider {
    val io: CoroutineDispatcher
    val default : CoroutineDispatcher
    val main : CoroutineDispatcher
}

class CoroutineContextProviderImpl : CoroutineContextProvider {
    override val io: CoroutineDispatcher
        get() = Dispatchers.IO
    override val default: CoroutineDispatcher
        get() = Dispatchers.Default
    override val main: CoroutineDispatcher
        get() = Dispatchers.Main

}