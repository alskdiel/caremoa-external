FROM openjdk:15-jdk-alpine
ARG JAR_FILE-=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8099
ENTRYPOINT ["java","-jar","/app.jar"]
