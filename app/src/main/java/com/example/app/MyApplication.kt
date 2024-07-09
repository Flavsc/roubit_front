package com.example.app

import android.app.Application
import org.koin.core.context.startKoin
import com.example.app.di.appModule

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }
}
