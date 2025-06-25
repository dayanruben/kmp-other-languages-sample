#!/usr/bin/env bash

set -ex

cd -- "$(dirname -- "${BASH_SOURCE[0]}")" &> /dev/null

rustc --crate-type dylib add.rs
rustc --crate-type staticlib add.rs

mkdir -p ../src/nativeMain/binaries/aarch64
mkdir -p ../src/jvmMain/resources/com/example/adder/aarch64

cp libadd.a ../src/nativeMain/binaries/aarch64
cp libadd.dylib ../src/jvmMain/resources/com/example/adder/aarch64
