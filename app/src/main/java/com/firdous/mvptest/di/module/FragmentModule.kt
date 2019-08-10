package com.firdous.mvptest.di.module

import com.firdous.mvptest.api.ApiServiceInterface
import com.firdous.mvptest.ui.about.AboutContract
import com.firdous.mvptest.ui.about.AboutPresenter
import com.firdous.mvptest.ui.list.ListContract
import com.firdous.mvptest.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}