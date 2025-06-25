#!/usr/bin/env bash

set -e

cd -- "$(dirname -- "${BASH_SOURCE[0]}")" &> /dev/null

../gradlew -q :adder:compileJvmMainJava

zig build-lib \
  -dynamic \
  --name add-jni \
  -I include \
  -I src/jvmMain/include/share \
  -I src/jvmMain/include/unix \
  -I build/generated/sources/headers/java/jvmMain \
  src/jvmMain/resources/com/example/adder/aarch64/libadd.dylib \
  src/jvmMain/c/com_example_adder_Jni.c

mv libadd-jni.dylib src/jvmMain/resources/com/example/adder/aarch64
