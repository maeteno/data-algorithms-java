#!/usr/bin/env bash

# clean
echo "清理空间"
rm -rf ./out/*
echo "=========================100%"

# build
echo "开始编译"
javac -d ./out/ ./test/Test.java
cd ./out
echo "=========================100%"

# run.sh
echo "执行测试"
echo "============================="
java test.Test
