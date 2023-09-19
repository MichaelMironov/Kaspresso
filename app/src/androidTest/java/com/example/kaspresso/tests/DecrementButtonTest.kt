package com.example.kaspresso.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.example.kaspresso.MainActivity
import com.example.kaspresso.screens.MainScreen
import org.junit.Rule
import org.junit.Test

class DecrementButtonTest : BaseTest() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun decrementButtonDecreaseCounter() = run {
        step("Decrease counter value to -4") {
            MainScreen {
                repeat(2) { decrementButton.doubleClick() }
            }
            MainScreen { counterText.hasText("Count: -4") }
        }
    }
}