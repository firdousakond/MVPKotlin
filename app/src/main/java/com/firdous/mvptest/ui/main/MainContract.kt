package com.firdous.mvptest.ui.main

import com.firdous.mvptest.ui.base.BaseContract


class MainContract {

    interface View: BaseContract.View {
        fun showAboutFragment()
        fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun onDrawerOptionAboutClick()
    }
}