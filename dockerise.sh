#!/usr/bin/env bash
docker build -t mogronalol/mesos-marathon-demo:$BUILD_NUMBER .
docker push mogronalol/mesos-marathon-demo:$BUILD_NUMBER
docker push mogronalol/mesos-marathon-demo:latest