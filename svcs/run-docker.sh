#!/bin/bash

echo -e "\033[31mdocker run --name=wdpr-ra/wdpr-auto-refimpl -e "deployEnv=LOCAL"  -e "ff4j-properties=ff4jfile.properties" -e "LOGLEVEL=debug" -d -p 8095:8080 wdpr-ra/wdpr-auto-refimpl:$1\033[0m"

docker run --name=auto-refimpl   -e "deployEnv=LOCAL"   -e "LOGLEVEL=debug"  -d -p 8095:8080 wdpr-ra/wdpr-auto-refimpl:$1

echo -e "\033[31mdocker logs -f wdpr-ra/wdpr-auto-refimpl\033[0m"
docker logs -f auto-refimpl
