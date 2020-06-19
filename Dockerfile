FROM openjdk:8-jdk-alpine
ENV APPJAR=helloDockerWorld-1.0-SNAPSHOT.jar

COPY build/libs/${APPJAR} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]