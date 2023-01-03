package com.foodshop.di.model

@kotlinx.serialization.Serializable
data class NutritionFacts(
    val calories: Double,
    val carbohydrates: Double,
    val fat: Double,
    val protein: Double,
    val weight: Int
)