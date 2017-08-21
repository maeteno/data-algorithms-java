#!/usr/bin/env bash

# build
javac -d ./out/ ./test/Test.java
cd ./out

# run.sh
java test.Test
