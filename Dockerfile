FROM openjdk:8

RUN apt-get update 
COPY target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
