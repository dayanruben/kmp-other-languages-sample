#include "com_example_adder_Jni.h"

#include "../../../include/add.h"
#include "../include/share/jni.h"

JNIEXPORT jint JNICALL Java_com_example_adder_Jni_add(JNIEnv *env, jclass clazz, jint a, jint b) {
	return kmp_add(a, b);
}
