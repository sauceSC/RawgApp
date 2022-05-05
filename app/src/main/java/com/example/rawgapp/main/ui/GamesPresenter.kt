package com.example.rawgapp.main.ui

import com.example.rawgapp.common.basemvp.BasePresenter
import com.example.rawgapp.main.interactor.GameInteractor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class GamesPresenter(
    private val gameInteractor: GameInteractor
) : BasePresenter<GamesContract.View>(),
    GamesContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)
    override fun getGamesList() {
        presenterScope.launch {
            try {
                val data = gameInteractor.getResults()
                view?.showGames(data)
            } catch (throwable: Throwable) {
                Timber.e(throwable.message)
            }

        }
    }

}