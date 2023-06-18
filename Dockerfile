FROM openjdk:17-jdk-alpine
COPY target/*SNAPSHOT.jar app.jar
EXPOSE 8099
ENTRYPOINT ["java","-jar","/app.jar"]

