#!/usr/bin/env bash
set -e
set -v
echo $DOCKER_PASSWORD
docker login -u mogronalol -p $DOCKER_PASSWORD
docker build -t mogronalol/mesos-marathon-demo:$BUILD_NUMBER .
docker push mogronalol/mesos-marathon-demo:$BUILD_NUMBER
