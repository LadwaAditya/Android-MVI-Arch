package com.aditya.mvi

import android.app.Activity
import android.app.Application
import com.aditya.mvi.injection.AppComponent
import com.aditya.mvi.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {
    
    private lateinit var appComponent: AppComponent
    
    @Inject lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    
    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }
    
    override fun onCreate() {
        super.onCreate()
        createAppComponent()
    }
    
    fun createAppComponent() {
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .remoteUrl("http://jsonplaceholder.typicode.com/")
            .build()
        appComponent.inject(this)
    }
    
}