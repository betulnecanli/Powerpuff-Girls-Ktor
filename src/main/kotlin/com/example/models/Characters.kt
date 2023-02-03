package com.example.models

import kotlinx.serialization.Serializable


@Serializable
data class Characters(
    val id : Int,
    val name : String,
    val image : String

)
