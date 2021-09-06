FROM openjdk:11
EXPOSE 8080
ADD target/spring-docker-ghactions.jar spring-docker-ghactions.jar
ENTRYPOINT ["java", "-jar", "/spring-docker-ghactions.jar"]