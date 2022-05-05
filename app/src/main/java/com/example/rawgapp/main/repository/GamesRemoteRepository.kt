package com.example.rawgapp.main.repository

import android.util.Log
import com.example.rawgapp.main.api.RawgApi
import com.example.rawgapp.main.converter.Converter
import com.example.rawgapp.main.model.Results
import com.example.rawgapp.utils.Constants

class GamesRemoteRepository(
    private val rawgApi: RawgApi
) : GamesRepository {
    override suspend fun getGames() : List<Results>{
        val data = rawgApi.getGames(Constants.API_KEY)
        Log.i("###", "RemoteRepository")
        return Converter.fromNetwork(data)
    }

}
