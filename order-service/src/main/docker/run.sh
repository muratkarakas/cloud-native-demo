#!/bin/sh


echo "********************************************************"
echo "Waiting for the configuration server to start on config-server 8888"
echo "********************************************************"
while ! `nc -z config-server 8888`; do sleep 3; done
echo "*******  Configuration Server has started"


echo "********************************************************"
echo "Waiting for the discovery server to start on discovery-server 8761"
echo "********************************************************"
while ! `nc -z discovery-server 8761`; do sleep 3; done
echo "*******  Discovery Server has started"

echo "********************************************************"
echo "Starting order-service "
echo "********************************************************"
java   $MEM_ARGS -Dspring.profiles.active=$PROFILE -jar app.jar
