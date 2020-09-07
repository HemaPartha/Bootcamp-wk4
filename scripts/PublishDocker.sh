#!/usr/bin/env bash
sbt clean compile

BUILD_NUMBER=1
echo Publishing docker image........

docker build -t bootcamp .
docker images
docker tag bootcamp-wk4 hemaparthasarathy/bootcamp
docker push hemaparthasarathy/bootcamp
