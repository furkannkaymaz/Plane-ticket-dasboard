package com.commerce.utils

import com.commerce.data.model.FlightModel


fun checkString(s: String?): Boolean {
    if (s == null || s == "") {
        return false
    }
    return true
}

fun checkArray(a: ArrayList<FlightModel?>?): Boolean {
    if (a.isNullOrEmpty()) {
        return false
    }
    return true
}