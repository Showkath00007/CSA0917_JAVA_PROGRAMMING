#!/bin/bash
mkdir -p bin
javac -cp "lib/*:." -d bin $(find src -name "*.java")
java -cp "lib/*:bin" com.swiftbook.booking.Main "$@"
