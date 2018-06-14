#!/bin/bash
cd $1
kotlinc *.kt -include-runtime -d $1.jar
java -jar $1.jar
cd ..
