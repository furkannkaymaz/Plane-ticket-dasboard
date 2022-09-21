package com.commerce

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import com.commerce.data.model.Data
import com.commerce.data.model.FlightModel
import com.commerce.utils.checkArray
import com.commerce.utils.checkString
import com.google.common.truth.Truth.assertThat
import com.google.gson.Gson

import org.junit.Test
import java.util.*

class TestSources {

    @Test
    fun emptyStringReturnFalse() {
        val result = checkString("")
        assertThat(result).isFalse()
    }

    @Test
    fun nullStringReturnFalse() {
        val result = checkString("")
        assertThat(result).isFalse()
    }

    @Test
    fun nullArrayReturnFalse() {
        val result = checkArray(null)
        assertThat(result).isFalse()
    }

    @Test
    fun emptyArrayReturnFalse() {
        val result = checkArray(arrayListOf())
        assertThat(result).isFalse()
    }

    @Test
     fun arraylistNotEmptyReturnTrue() {

    }
}