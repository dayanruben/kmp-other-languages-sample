package com.example.adder

private val nativeLibraryLoader by lazy {
	NativeLibrary.loadEmbeddedNativeLibrary("add")
}

public fun add(a: Int, b: Int): Int {
	nativeLibraryLoader

	return Libadd.kmp_add(a, b)
}
