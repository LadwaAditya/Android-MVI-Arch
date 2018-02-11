package com.aditya.mvi.injection

import android.app.Application
import com.aditya.mvi.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    AndroidSupportInjectionModule::class
])
interface AppComponent : AndroidInjector<App> {
    
    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        
        @BindsInstance
        fun application(application: Application): Builder
        
        @BindsInstance
        fun remoteUrl(@Named("base_url") url: String): Builder
    }
}