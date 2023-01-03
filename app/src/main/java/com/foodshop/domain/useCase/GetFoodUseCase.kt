package com.foodshop.domain.useCase

import com.foodshop.domain.repository.FoodRepository

class GetFoodUseCase(private val repository: FoodRepository) {

    suspend operator fun invoke() = repository.getFoodList()
}