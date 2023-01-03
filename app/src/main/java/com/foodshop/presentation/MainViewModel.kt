package com.foodshop.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.foodshop.di.model.FoodResponse
import com.foodshop.di.model.FoodResponseItem
import com.foodshop.domain.useCase.GetFoodUseCase
import kotlinx.coroutines.launch

class MainViewModel(
    private val getFoodUseCase: GetFoodUseCase
): ViewModel() {

    private val _foodResponse = MutableLiveData<FoodResponse>()
    val foodResponse: LiveData<FoodResponse> get() = _foodResponse

    init {
        getFoodResponse()
    }

    private fun getFoodResponse() = viewModelScope.launch {
        _foodResponse.value = getFoodUseCase.invoke()
        Log.e("valueOf_foodResponse", _foodResponse.value.toString())
    }
}