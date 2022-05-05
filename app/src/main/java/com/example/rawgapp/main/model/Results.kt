package com.example.rawgapp.main.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Results(
    val name: String,
    val backgroundImage: String
) : Parcelable
