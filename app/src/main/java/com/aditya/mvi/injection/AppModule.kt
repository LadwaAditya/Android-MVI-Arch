package com.aditya.mvi.injection

import `in`.epaylater.data.AppDataManager
import `in`.epaylater.data.DataManager
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class AppModule {
    
    @Binds
    @Singleton
    internal abstract fun provideDataManager(dataManager: AppDataManager): DataManager
    
}