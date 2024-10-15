FROM openjdk:17

WORKDIR /app

COPY target/Tp-Spring-1.0.jar /app/app.jar

EXPOSE 8082


ENTRYPOINT ["java", "-jar", "/app/app.jar"]