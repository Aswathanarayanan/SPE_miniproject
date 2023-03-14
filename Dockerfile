FROM ubuntu 

RUN apt-get update 
COPY /var/lib/jenkins/workspace/miniproject_calculator/calculator/target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
