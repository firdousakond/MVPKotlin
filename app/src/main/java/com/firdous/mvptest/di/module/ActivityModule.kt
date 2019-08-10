package com.firdous.mvptest.di.module

import android.app.Activity
import com.firdous.mvptest.ui.main.MainContract
import com.firdous.mvptest.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}