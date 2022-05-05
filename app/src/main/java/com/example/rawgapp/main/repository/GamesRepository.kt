package com.example.rawgapp.main.repository

import com.example.rawgapp.main.model.Results

interface GamesRepository {
    suspend fun getGames(): List<Results>

}