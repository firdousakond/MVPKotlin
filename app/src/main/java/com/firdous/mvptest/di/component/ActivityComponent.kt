package com.firdous.mvptest.di.component

import com.firdous.mvptest.di.module.ActivityModule
import com.firdous.mvptest.ui.main.MainActivity
import dagger.Component


@Component(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}