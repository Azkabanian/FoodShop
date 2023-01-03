package com.foodshop.data.api

import com.foodshop.di.model.FoodResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodApi {

    @GET("category/1")
    suspend fun fetchFoodList(
        @Query("page")
        page: Int = 1
    ): FoodResponse
}