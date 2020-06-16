#!/bin/bash

DOCKER_IMAGE="wdpr-ra/wdpr-auto-refimpl"

echo -e "\033[31mmvn -DskipTests clean package\033[0m"
mvn -DskipTests clean package

echo -e "\033[31meval \$(aws ecr get-login --region us-east-1 --profile wdpr-apps)\033[0m"
eval $(aws ecr get-login --region us-east-1 --profile wdpr-apps)

echo -e "\033[31mdocker build -t $DOCKER_IMAGE:$1 .\033[0m"
docker build -t $DOCKER_IMAGE:$1 .

