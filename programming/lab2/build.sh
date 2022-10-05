#!/usr/local/bin/zsh

javac -cp Pokemon.jar -d ./bin src/**/*.java
jar cmf src/Manifest.txt lab2.jar -C bin/ .
