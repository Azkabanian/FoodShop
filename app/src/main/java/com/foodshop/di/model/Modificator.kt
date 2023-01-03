package com.foodshop.di.model

@kotlinx.serialization.Serializable
data class Modificator(
    val modifications: List<Modification>,
    val name: String
)