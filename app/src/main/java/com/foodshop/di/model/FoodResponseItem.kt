package com.foodshop.di.model

import kotlinx.serialization.Polymorphic

@kotlinx.serialization.Serializable
data class FoodResponseItem(
    val id: Int,
    val name: String,
    val image: String,
    val price: Int,
    val oldPrice: Int,
    val description: String,
    @Polymorphic
    val isFavorite: Any?,
    val nutritionFacts: NutritionFacts,
    val modificator: Modificator?
)