package com.example.rawgapp.main.api.model


import com.google.gson.annotations.SerializedName

data class RequirementsResponse(
    @SerializedName("minimum")
    val minimum: String,
    @SerializedName("recommended")
    val recommended: String
)