package com.example.gui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adder.add

@Composable
fun Adder() {
	Column(
		modifier = Modifier.padding(16.dp),
		verticalArrangement = Arrangement.spacedBy(8.dp),
	) {
		val aState = rememberTextFieldState("")
		TextField(
			state = aState,
			label = { Text("First integer") },
			modifier = Modifier.fillMaxWidth(),
		)

		val bState = rememberTextFieldState("")
		TextField(
			state = bState,
			label = { Text("Second integer") },
			modifier = Modifier.fillMaxWidth(),
		)

		val a = aState.text.toString().toIntOrNull()
		val b = bState.text.toString().toIntOrNull()
		if (a != null && b != null) {
			val sum = add(a, b)
			Text(
				text = "$a + $b = $sum",
				modifier = Modifier.padding(top = 8.dp),
				fontSize = 30.sp,
			)
		}
	}
}
