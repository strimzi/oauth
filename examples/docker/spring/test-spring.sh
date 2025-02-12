#!/usr/bin/env bash
set -x

docker rm -f spring
docker run -d --name spring strimzi/example-spring
for i in {1..60}
do
  sleep 1
  RESULT=$(docker logs spring | grep "Started SpringAuthorizationServerApplication")
  if [ "$RESULT" != "" ]; then
     docker rm -f spring
     exit 0
  fi
done

echo "Failed to start Spring example"
docker logs spring
exit 1
