FROM openjdk:17

EXPOSE 8082


ENTRYPOINT ["java", "-jar", "tpfoyer.jar"]