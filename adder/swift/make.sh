#!/usr/bin/env bash

set -ex

cd -- "$(dirname -- "${BASH_SOURCE[0]}")" &> /dev/null

swiftc -emit-library add.swift
swiftc -emit-library -static add.swift

mkdir -p ../src/nativeMain/binaries/aarch64
mkdir -p ../src/jvmMain/resources/com/example/adder/aarch64

cp libadd.a ../src/nativeMain/binaries/aarch64
cp libadd.dylib ../src/jvmMain/resources/com/example/adder/aarch64
