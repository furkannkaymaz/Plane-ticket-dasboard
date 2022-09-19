package com.commerce.home.viewmodel

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.commerce.data.model.FlightModel
import com.commerce.data.repository.HomeRepository
import com.commerce.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val home: HomeRepository) : ViewModel() {

    private val _getData: MutableLiveData<FlightModel> = MutableLiveData()
    val getData: LiveData<FlightModel?>
        get() = _getData

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean>
        get() = _isLoading

    private val _error: MutableLiveData<String> = MutableLiveData()
    val error: LiveData<String>
        get() = _error

    fun getData(context: Context) = viewModelScope.launch {

        val response = home.getData(context)

        if (response.data != null) {
            _getData.postValue(response)
            _isLoading.value = false
        } else {
            _error.postValue("Hata")
            _isLoading.value = true
        }
    }
}
