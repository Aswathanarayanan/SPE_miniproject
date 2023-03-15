FROM openjdk:18

RUN apt-get update 
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","./calculator-1.0-SNAPSHOT.jar"]
