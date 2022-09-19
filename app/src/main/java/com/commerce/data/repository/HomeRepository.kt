package com.commerce.data.repository

import android.content.Context
import android.content.res.Resources
import com.commerce.R
import com.commerce.base.BaseRepository
import com.commerce.data.model.FlightModel
import com.google.gson.Gson
import javax.inject.Inject

class HomeRepository @Inject constructor(){

    fun getData(context: Context) : FlightModel{
        val response = context.resources.openRawResource(R.raw.enuygun_flight_search).bufferedReader().use { it.readText() }
        return Gson().fromJson(response, FlightModel:: class.java)
    }

}

