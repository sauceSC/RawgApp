package com.example.rawgapp.main.di

import com.example.rawgapp.main.interactor.GameInteractor
import com.example.rawgapp.main.repository.GamesRemoteRepository
import com.example.rawgapp.main.ui.GamesPresenter
import com.example.rawgapp.main.ui.GamesContract
import org.koin.dsl.bind
import org.koin.dsl.module

object MainModule {
    fun create() = module {
        single { GamesPresenter(get()) } bind GamesContract.Presenter::class
        factory {
            val interactor = GameInteractor(get())
            interactor
        } bind GameInteractor::class
        single <GamesRemoteRepository> {GamesRemoteRepository(get())}
    }
}