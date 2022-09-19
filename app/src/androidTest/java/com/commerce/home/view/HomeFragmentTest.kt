package com.commerce.home.view

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.commerce.R
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito

@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

    @Test
    fun testNavigation() {

        val mockNavController = Mockito.mock(NavController::class.java)

        launchFragmentInContainer<HomeFragment>().onFragment {
            Navigation.setViewNavController(it.requireView(), mockNavController)
        }
        //   Espresso.onView(ViewMatchers.withId(R.id.btnGoSecond)).perform(ViewActions.click())
        //   verify(mockNavController).navigate(FragmentDirections.actionFragment())
        //   use 2 line to check navigate navController
    }

    @Test
    fun testTextView() {
        launchFragmentInContainer<HomeFragment>().onFragment {}

        Espresso.onView(ViewMatchers.withId(R.id.tvHello))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello")))
    }
}