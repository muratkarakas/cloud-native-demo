FROM openjdk:8-jdk-alpine

ADD discovery-server-0.0.1-SNAPSHOT.jar app.jar
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh