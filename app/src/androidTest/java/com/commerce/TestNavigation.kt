package com.commerce

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.commerce.home.view.HomeFragment
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.*

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @Test
    fun testNavigation() {

        val mockNavController = mock(NavController::class.java)

        launchFragmentInContainer<HomeFragment>().onFragment {
            Navigation.setViewNavController(it.requireView(), mockNavController)
        }

        //   Espresso.onView(ViewMatchers.withId(R.id.btnGoSecond)).perform(ViewActions.click())
        //   verify(mockNavController).navigate(FragmentDirections.actionFragment())
        //   use 2 line to check navigate navController
    }
}