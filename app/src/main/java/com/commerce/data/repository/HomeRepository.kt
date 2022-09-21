package com.commerce.data.repository

import android.content.Context
import com.commerce.R
import com.commerce.data.model.FlightModel
import com.google.gson.Gson
import javax.inject.Inject

class HomeRepository @Inject constructor(){

    suspend fun getData(context: Context) : FlightModel{
        val response = context.resources.openRawResource(R.raw.enuygun_flight_search).bufferedReader().use { it.readText() }
        return Gson().fromJson(response, FlightModel:: class.java)
    }
}

