FROM gradle:jdk17 as build

WORKDIR /workspace
COPY . .

RUN gradle bootJar && gradle bootJar

FROM openjdk:17-jdk-alpine

COPY --from=build /workspace/build/libs/eist-*.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
