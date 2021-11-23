package ru.grakhell.composecodelabs.rally

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasParent
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.printToLog
import org.junit.Rule
import org.junit.Test
import ru.grakhell.composecodelabs.rally.ui.components.RallyTopAppBar
import ru.grakhell.composecodelabs.rally.ui.overview.OverviewBody

class TopAppBarTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun rallyTopAppBarTest() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }
        composeTestRule.onRoot().printToLog("currentLabelExists")
        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsSelected()
    }
    @Test
    fun rallyTopAppBarTest_useUnmergedTree() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }
        composeTestRule.onRoot(useUnmergedTree = true).printToLog("currentLabelExists")
        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsSelected()
    }

    @Test
    fun rallyTopAppBarTest_byText() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }
        composeTestRule.onRoot(useUnmergedTree = true).printToLog("currentLabelExists")
        composeTestRule
            .onNode(
                hasText(RallyScreen.Accounts.name.uppercase()) and
                    hasParent(
                        hasContentDescription(RallyScreen.Accounts.name)
                    ),
                useUnmergedTree = true
            )
            .assertExists()
    }



    @Test
    fun rallyTopAppBarTest_Selection() {
        val allScreens = RallyScreen.values().toList()
        val currentScreen =  mutableStateOf(RallyScreen.Accounts)
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { screen -> currentScreen.value = screen },
                currentScreen = currentScreen.value
            )
        }
        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertExists()
            .assert( SemanticsMatcher("Accounts") {currentScreen.value.name == RallyScreen.Accounts.name})
        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Bills.name)
            .assertExists()
            .performClick()
            .assert(SemanticsMatcher("Bills") {currentScreen.value.name == RallyScreen.Bills.name})
        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Overview.name)
            .assertExists()
            .performClick()
            .assert(SemanticsMatcher("Overview") {currentScreen.value.name == RallyScreen.Overview.name})
    }
}