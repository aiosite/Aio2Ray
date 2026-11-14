#!/bin/bash
# Compile hev-socks5-tunnel for Android NDK
# Based on mtpali/v2box compile-hevtun.sh

set -e

NDK_VERSION=29.0.14206865
NDK_PATH=$HOME/Android/Sdk/ndk/$NDK_VERSION
export NDK=$NDK_PATH

echo "Compiling hev-socks5-tunnel for arm64-v8a..."
cd hev-socks5-tunnel
cmake -DCMAKE_TOOLCHAIN_FILE=$NDK/build/cmake/android.toolchain.cmake \
      -DANDROID_ABI=arm64-v8a \
      -DANDROID_PLATFORM=android-21 \
      -DCMAKE_BUILD_TYPE=Release \
      -B build-arm64
cmake --build build-arm64 --config Release

echo "Compiling hev-socks5-tunnel for armeabi-v7a..."
cmake -DCMAKE_TOOLCHAIN_FILE=$NDK/build/cmake/android.toolchain.cmake \
      -DANDROID_ABI=armeabi-v7a \
      -DANDROID_PLATFORM=android-21 \
      -DCMAKE_BUILD_TYPE=Release \
      -B build-armv7
cmake --build build-armv7 --config Release

echo "Compilation complete. Libraries are in build-*/lib/"
