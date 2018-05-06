#!/bin/sh




echo "********************************************************"
echo "Starting config-server "
echo "********************************************************"
java   $MEM_ARGS -Dspring.profiles.active=$PROFILE -jar app.jar
