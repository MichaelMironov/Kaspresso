package com.example.kaspresso.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.example.kaspresso.MainActivity
import com.example.kaspresso.screens.MainScreen
import org.junit.Rule
import org.junit.Test

class IncrementButtonTest : BaseTest() {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun incrementButtonShouldIncreaseCounter() = run {
        step("Increase counter to 2") { MainScreen { incrementButton.doubleClick() } }
        step("Counter should be equal 2") { MainScreen { counterText.hasText("Count: 2") } }
    }
}