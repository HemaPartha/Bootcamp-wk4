#!/usr/bin/env bash
echo Publishing docker image........
echo "build" + $TRAVIS_BUILD_NUMBER
echo $PACKAGE_NAME
docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD

docker build -t bootcamp .
docker images
docker tag bootcamp hemaparthasarathy/bootcamp:$TRAVIS_BUILD_NUMBER
docker push hemaparthasarathy/bootcamp:$TRAVIS_BUILD_NUMBER