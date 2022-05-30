#!/bin/sh

echo "Building $1"
for f in ./$1/*.java
  basename $f
  javac $f
  java "$(echo ${1}.$(basename $f))"
done