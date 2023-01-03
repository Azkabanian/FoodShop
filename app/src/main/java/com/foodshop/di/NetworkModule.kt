package com.foodshop.di

import com.foodshop.BuildConfig
import com.foodshop.data.api.FoodApi
import com.foodshop.data.repository.FoodRepositoryImpl
import com.foodshop.domain.repository.FoodRepository
import com.foodshop.domain.useCase.GetFoodUseCase
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {

    single { createService(get()) }

    single { provideRetrofit() }
}

fun createService(retrofit: Retrofit): FoodApi = retrofit.create(FoodApi::class.java)

fun provideRetrofit(): Retrofit =
    Retrofit.Builder()
        .baseUrl(BuildConfig.GRADLE_API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

fun createFoodRepository(apiService: FoodApi): FoodRepository {
    return FoodRepositoryImpl(apiService)
}

fun createGetFoodUseCase(foodRepository: FoodRepository): GetFoodUseCase {
    return GetFoodUseCase(foodRepository)
}