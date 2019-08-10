package com.firdous.mvptest

import android.app.Application
import com.firdous.mvptest.di.component.ApplicationComponent
import com.firdous.mvptest.di.component.DaggerApplicationComponent
import com.firdous.mvptest.di.module.ApplicationModule
import com.ogulcan.android.mvp.app.BuildConfig

class BaseApp: Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: BaseApp private set
    }
}