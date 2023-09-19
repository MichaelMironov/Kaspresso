package com.example.kaspresso.tests

import com.example.kaspresso.screens.MainScreen
import io.qameta.allure.kotlin.junit4.DisplayName
import org.junit.Test

class ButtonsTest : BaseTest() {

    @Test
    @DisplayName("[UNIT] Increase count")
    fun incrementButtonShouldIncreaseCounter() = run {
        step("Increase counter to 2") { MainScreen { incrementButton.doubleClick() } }
        step("Counter should be equal 2") { MainScreen { counterText.hasText("Count: 2") } }
    }

    @Test
    @DisplayName("[UNIT] Decrease count")
    fun decrementButtonDecreaseCounter() = run {
        step("Decrease counter value to '-4'") {
            MainScreen { repeat(4) { decrementButton.click() } }
        }
        step("Counter should equal '-4'") {
            MainScreen { counterText.hasText("Count: -4") }
        }
    }

    @Test
    @DisplayName("[UNIT] Reset count")
    fun clearButtonResetCount() = run {
        step("Increase counter value to '2") { MainScreen.incrementButton.doubleClick() }
        step("Click button 'Clear'") { MainScreen.clearButton.click() }
        step("Counter should equal '0'") { MainScreen { counterText.hasText(0) } }
    }
}