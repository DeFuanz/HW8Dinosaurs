package com.example.hw8dinosaurs.network

import android.health.connect.datatypes.units.Length
import kotlinx.serialization.SerialName
import  kotlinx.serialization.Serializable

@Serializable
data class DinosaurPhoto(
    val name: String,
    val length: String,
    val description: String,
    @SerialName(value = "img_src")
    val imgSrc: String
)
