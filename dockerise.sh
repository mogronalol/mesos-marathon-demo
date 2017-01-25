#!/usr/bin/env bash
set -e
docker build -t mogronalol/mesos-marathon-demo:$BUILD_NUMBER .
docker push mogronalol/mesos-marathon-demo:$BUILD_NUMBER
