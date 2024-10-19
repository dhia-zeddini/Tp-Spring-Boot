FROM openjdk:17

WORKDIR /app

ARG NEXUSUSERNAME
ARG NEXUSPASSWORD
RUN  curl -u $NEXUSUSERNAME:$NEXUSPASSWORD -O http://192.168.33.10:8081/repository/maven-releases/com/example/Tp-Spring/1.0/Tp-Spring-1.0.jar

EXPOSE 8089

ENTRYPOINT ["java", "-jar", "/app/Tp-Spring-1.0.jar"]
