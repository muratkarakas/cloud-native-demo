#!/bin/bash
cd config-server
mvn package docker:build -DskipTests

cd ..

cd discovery-server
mvn package docker:build -DskipTests

cd ..

cd log-support
mvn install

cd ..


cd tracing-support
mvn install



cd ..

cd customer-service
mvn package docker:build -DskipTests

cd ..

cd product-service
mvn package docker:build -DskipTests

cd ..


cd edge-gateway
mvn package docker:build -DskipTests

cd ..

cd order-service
mvn package docker:build -DskipTests

cd ..

cd rating-service
mvn package docker:build -DskipTests





