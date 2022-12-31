package com.foodshop.data.api

import com.foodshop.data.model.FoodResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodApi {

    @GET("category/1")
    suspend fun getFood(
        @Query("page")
        page: Int = 1
    ): FoodResponse
}