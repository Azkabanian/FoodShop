package com.foodshop

import android.app.Application
import com.foodshop.di.appModule
import com.foodshop.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class FoodApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@FoodApp)
            modules(listOf(appModule, networkModule))
        }
    }
}