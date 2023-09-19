package com.example.kaspresso.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import com.example.kaspresso.MainActivity
import com.example.kaspresso.screens.MainScreen
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class IncrementButtonTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.withForcedAllureSupport()
) {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun incrementButtonShouldIncreaseCounter() = run {
        step("Increase counter to 2") { MainScreen { incrementButton.doubleClick() } }
        step("Counter should be equal 2") { MainScreen { counterText.hasText("Count: 2") } }
    }
}