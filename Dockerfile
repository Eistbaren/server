FROM gradle:jdk17 as build

WORKDIR /workspace
COPY . .

RUN gradle bootJar

FROM openjdk:17-jdk-alpine

RUN apk add --no-cache tzdata
ENV TZ=Europe/Berlin
COPY --from=build /workspace/build/libs/eist-*.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
