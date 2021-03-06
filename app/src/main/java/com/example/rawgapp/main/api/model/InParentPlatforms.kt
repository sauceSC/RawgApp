package com.example.rawgapp.main.api.model

import com.google.gson.annotations.SerializedName

data class InParentPlatforms(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)
