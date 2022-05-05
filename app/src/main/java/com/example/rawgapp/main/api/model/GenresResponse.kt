package com.example.rawgapp.main.api.model

import com.google.gson.annotations.SerializedName

data class GenresResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name:String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("image_background")
    val imageBackground: String
)
