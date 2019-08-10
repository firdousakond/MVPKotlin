package com.firdous.mvptest.di.component

import com.firdous.mvptest.BaseApp
import com.firdous.mvptest.di.module.ApplicationModule
import dagger.Component


@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: BaseApp)

}