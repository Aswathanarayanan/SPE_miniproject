FROM ubuntu 

RUN apt-get update 
COPY SPE_miniproject/calculator/target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
