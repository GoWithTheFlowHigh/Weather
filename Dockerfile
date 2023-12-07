from openjdk:17-jdk-slim
copy target/.*jar weather-app.jar
entrypoint ["java","-jar","weather-app.jar"]
