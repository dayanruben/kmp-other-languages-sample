package com.example.adder;

final class Jni {
	static {
		NativeLibrary.loadEmbeddedNativeLibrary("add");
		NativeLibrary.loadEmbeddedNativeLibrary("add-jni");
	}

	static native int add(int a, int b);

	private Jni() {}
}
