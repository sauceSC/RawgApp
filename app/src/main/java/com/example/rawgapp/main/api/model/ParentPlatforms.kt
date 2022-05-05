package com.example.rawgapp.main.api.model

import com.google.gson.annotations.SerializedName

data class ParentPlatforms(
    @SerializedName("platform")
    val platform: List<InParentPlatforms>
)
