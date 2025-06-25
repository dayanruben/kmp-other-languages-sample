package com.example.adder

public actual fun add(a: Int, b: Int): Int {
	return Jni.add(a, b)
}
