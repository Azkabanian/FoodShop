package com.foodshop.di

import com.foodshop.data.repository.FoodRepositoryImpl
import com.foodshop.domain.repository.FoodRepository
import com.foodshop.domain.useCase.GetFoodUseCase
import com.foodshop.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single { GetFoodUseCase(get()) }
    single<FoodRepository> { FoodRepositoryImpl(get()) }
    viewModel { MainViewModel(get()) }

}