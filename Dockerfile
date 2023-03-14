FROM ubuntu 

RUN apt-get update 
COPY calculator/target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
