package ru.grakhell.composecodelabs.rally

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test
import ru.grakhell.composecodelabs.rally.ui.overview.OverviewBody

class ScreensTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun overviewScreen_alertsDisplayed() {
        composeTestRule.setContent {
            OverviewBody()
        }
        composeTestRule
            .onNodeWithText("Alerts")
            .assertIsDisplayed()
    }
}