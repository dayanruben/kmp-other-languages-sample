# KMP with other languages sample

This sample begins to demonstrate how to ship code written in non-Kotlin languages
behind a Kotlin multiplatform API. It focuses on leveraging tooling such as Kotlin's
cinterop to produce type-safe native APIs, Java's header generation to produce type-safe
JNI headers, and Java's jextract to produce type-safe JVM APIs (for JDK 22 and newer).

Spoiler alert: the mechanism which makes all this work is the C ABI. If you have something
which exposes or can expose C ABI-compatible functions then you can use it from just about
any Kotlin target with a little work.

Shipping a comprehensive abstraction of a rich native library based on these principles
is possible, but as the native code gets more complex so will your integration. This
sample deliberately ignores the nuances of full-fledged build systems and dependency
management for the native languages. It also does not use tools designed to simplify the
interaction of a large API surface in each language across a C-compatible boundary.

If you choose to productionize a Kotlin multiplatform solution based around a native library
written in a non-Kotlin language, you will need to design a tighter integration at the build
system layer. This is very much an exercise left to the reader since it otherwise would drown
this sample in complexity but also that it has an element of taste to it.


## Languages

You **must** choose a language and build its shared library before anything will work!

### C

```
$ adder/c/make.sh
```

### C++

```
$ adder/cpp/make.sh
```

### Rust

```
$ adder/rust/make.sh
```

### Swift

```
$ adder/swift/make.sh
```

### Zig

```
$ adder/zig/make.sh
```

### JNI

Once language binaries are built, the JNI binary needs to be built.

```
$ adder/make-jni.sh
```


# License

    Copyright 2025 Jake Wharton

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
