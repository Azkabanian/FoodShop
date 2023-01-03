package com.foodshop.domain.repository

import com.foodshop.di.model.FoodResponse

interface FoodRepository {

    suspend fun getFoodList(): FoodResponse
}