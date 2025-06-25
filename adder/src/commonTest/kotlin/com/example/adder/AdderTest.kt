package com.example.adder

import kotlin.test.Test
import kotlin.test.assertEquals

class AddTest {
	@Test fun simple() {
		assertEquals(3, add(1, 2))
		assertEquals(-1, add(1, -2))
		assertEquals(1, add(-1, 2))
		assertEquals(-3, add(-1, -2))
	}
}
