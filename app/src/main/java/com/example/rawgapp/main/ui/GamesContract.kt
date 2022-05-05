package com.example.rawgapp.main.ui

import com.example.rawgapp.common.basemvp.BaseFragmentContract
import com.example.rawgapp.common.basemvp.MvpPresenter
import com.example.rawgapp.common.basemvp.MvpView
import com.example.rawgapp.main.api.model.ResultResponse
import com.example.rawgapp.main.model.Results

interface GamesContract : BaseFragmentContract {
    interface View : MvpView {
        fun showGames(results: List<Results>)
        fun onFail(throwable: Throwable)

    }

    interface Presenter : MvpPresenter<View> {
        fun getGamesList()
    }

}