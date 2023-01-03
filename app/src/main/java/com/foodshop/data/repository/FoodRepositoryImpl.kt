package com.foodshop.data.repository

import com.foodshop.data.api.FoodApi
import com.foodshop.domain.repository.FoodRepository

class FoodRepositoryImpl(private val api : FoodApi): FoodRepository {

    override suspend fun getFoodList() = api.fetchFoodList()
}