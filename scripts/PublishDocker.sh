#!/usr/bin/env bash
echo Publishing docker image........

docker build -t bootcamp .
docker images
docker tag bootcamp hemaparthasarathy/bootcamp
docker push hemaparthasarathy/bootcamp
