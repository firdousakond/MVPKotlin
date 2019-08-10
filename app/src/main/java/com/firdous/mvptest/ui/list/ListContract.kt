package com.firdous.mvptest.ui.list

import com.firdous.mvptest.ui.base.BaseContract
import com.firdous.mvptest.models.DetailsViewModel
import com.firdous.mvptest.models.Post

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}