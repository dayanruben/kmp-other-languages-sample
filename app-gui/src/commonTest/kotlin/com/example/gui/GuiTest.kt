package com.example.gui

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

class GuiTest {
	@Test fun add() = runComposeUiTest {
		setContent { Adder() }

		onNodeWithText("First integer")
			.performTextInput("34")
		onNodeWithText("Second integer")
			.performTextInput("45")

		onNodeWithText("34 + 45", substring = true)
			.assert(hasText("= 79", substring = true))
	}
}
