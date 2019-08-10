package com.firdous.mvptest.di.component

import com.firdous.mvptest.di.module.FragmentModule
import com.firdous.mvptest.ui.about.AboutFragment
import com.firdous.mvptest.ui.list.ListFragment
import dagger.Component


@Component(modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}