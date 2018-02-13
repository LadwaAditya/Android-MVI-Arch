package com.aditya.mvi.post

import `in`.epaylater.data.DataManager
import android.arch.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject()
constructor(private val dataManager: DataManager) : ViewModel() {

}