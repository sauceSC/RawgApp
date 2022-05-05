package com.example.rawgapp.main.converter

import android.util.Log
import com.example.rawgapp.main.api.model.GamesResponse
import com.example.rawgapp.main.model.Results

object Converter {
    fun fromNetwork(response: GamesResponse) : List<Results>{
        return response.results.map{result ->
            Results(
                name = result.name,
                backgroundImage = result.backgroundImage
            )
        }
    }

}
