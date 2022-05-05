package com.example.rawgapp.main.api.model

import com.google.gson.annotations.SerializedName

data class StoresResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("store")
    val store: StoresResponse
)
