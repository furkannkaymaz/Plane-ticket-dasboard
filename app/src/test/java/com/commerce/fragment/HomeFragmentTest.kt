package com.commerce.fragment

import android.os.Build
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.commerce.home.view.HomeFragment
import com.espressosample.launchFragmentInHiltContainer
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

// testing using hilt + RobolectricTestRunner with hiltExt

@HiltAndroidTest
@RunWith(RobolectricTestRunner::class)
@Config(
    manifest = Config.NONE,
    sdk = [Build.VERSION_CODES.O_MR1],
    application = HiltTestApplication::class
)
class HomeFragmentTest {

    @get:Rule
    val hiltAndroidRule = HiltAndroidRule(this)

    @Before
    fun setup(){
        hiltAndroidRule.inject()
    }

    @Test
    fun homeFragmentTest() {
        launchFragmentInHiltContainer<HomeFragment> {
        }
    }
}