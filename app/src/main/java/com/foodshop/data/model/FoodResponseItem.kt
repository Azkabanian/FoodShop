package com.foodshop.data.model

data class FoodResponseItem(
    val description: String,
    val id: Int,
    val image: String,
    val isFavorite: Any,
    val modificator: Modificator,
    val name: String,
    val nutritionFacts: NutritionFacts,
    val oldPrice: Int,
    val price: Int
)