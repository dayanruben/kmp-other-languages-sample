#!/usr/bin/env bash

set -ex

cd -- "$(dirname -- "${BASH_SOURCE[0]}")" &> /dev/null

gcc -dynamiclib -I ../include add.c -o libadd.dylib
gcc -c -I ../include add.c -o libadd.o
ar rvs libadd.a libadd.o

mkdir -p ../src/nativeMain/binaries/aarch64
mkdir -p ../src/jvmMain/resources/com/example/adder/aarch64

cp libadd.a ../src/nativeMain/binaries/aarch64
cp libadd.dylib ../src/jvmMain/resources/com/example/adder/aarch64
