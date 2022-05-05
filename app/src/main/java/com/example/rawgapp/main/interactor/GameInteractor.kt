package com.example.rawgapp.main.interactor

import com.example.rawgapp.main.model.Results
import com.example.rawgapp.main.repository.GamesRemoteRepository

class GameInteractor(
    private val gamesRemoteRepository: GamesRemoteRepository
) {
    suspend fun getResults() : List<Results>{
        gamesRemoteRepository.getGames()
        return gamesRemoteRepository.getGames()
    }
}