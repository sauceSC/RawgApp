package com.example.rawgapp.main.api

import com.example.rawgapp.main.api.model.GamesResponse
import com.example.rawgapp.main.api.model.ResultResponse
import com.example.rawgapp.main.model.Games
import com.example.rawgapp.main.model.Results
import retrofit2.http.GET
import retrofit2.http.Query

interface RawgApi {
    @GET("games")
    suspend fun getGames(
        @Query("key")
        key: String
    ): GamesResponse
}
