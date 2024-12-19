FROM openjdk:18-jdk-slim
WORKDIR /app

COPY ./target/spring-devops-0.0.1-SNAPSHOT.jar /app

EXPOSE 5050
CMD [ "java","-jar","spring-devops-0.0.1-SNAPSHOT.jar" ]