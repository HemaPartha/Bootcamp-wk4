#!/usr/bin/env bash
sbt clean compile

BUILD_NUMBER=1
echo Publishing docker image........

docker build -t bootcamp-wk4 .
docker images
docker tag bootcamp-wk4 hemaparthasarathy/bootcamp-wk4
docker push hemaparthasarathy/bootcamp-wk4
