package com.commerce.home.viewmodel

import androidx.lifecycle.ViewModel
import com.commerce.home.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val home: HomeRepository) : ViewModel() {

}