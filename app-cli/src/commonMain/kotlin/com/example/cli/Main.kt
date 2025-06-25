@file:JvmName("Main")

package com.example.cli

import com.example.adder.add
import kotlin.jvm.JvmName

fun main() {
	print("Enter first integer: ")
	val a = readln().toInt()

	print("Enter second integer: ")
	val b = readln().toInt()

	val sum = add(a, b)
	println()
	println("$a + $b = $sum")
}
