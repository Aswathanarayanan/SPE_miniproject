FROM openjdk:19

#RUN apt-get update 
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","./calculator-1.0-SNAPSHOT.jar"]
