package com.firdous.mvptest.di.module

import android.app.Application
import com.firdous.mvptest.BaseApp
import com.firdous.mvptest.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return baseApp
    }
}