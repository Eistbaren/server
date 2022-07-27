<h1 align="center">
  Reservation-Bear server
</h1>
<p align="center">
  <a href="https://www.codacy.com?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Eistbaren/backend&amp;utm_campaign=Badge_Grade">
    <img alt="Codacy Badge" src="https://app.codacy.com/project/badge/Grade/9394e379bcaa47c285a9b1f129ab1453" />
  </a>
  <a href="https://github.com/Eistbaren/backend/actions/workflows/pushToBitbucket.yml">
    <img alt="Push to bitbucket" src="https://github.com/Eistbaren/backend/actions/workflows/pushToBitbucket.yml/badge.svg" />
  </a>
  <a href="https://github.com/Eistbaren/backend/actions/workflows/dockerimage.yml">
    <img alt="Build and push preview docker image" src="https://github.com/Eistbaren/backend/actions/workflows/dockerimage.yml/badge.svg" />
  </a>
</p>

Server of the Reservation-Bear. 🐻‍❄️
Hosted at [reservation-bear.de](https://reservation-bear.de).

## Run server

Choose one of these options and then the server should be running under http://localhost:8080

##### Mail server

However before running your application you need a smtp mail server account in order to send the emails.
When you have them set these enviroment variables properly. ([For more information visit here](https://www.baeldung.com/spring-email#2-spring-boot-mail-server-properties))

```sh
SPRING_MAIL_HOST=mymail.website.com
SPRING_MAIL_USERNAME=myemail@website.com
SPRING_MAIL_PASSWORD=secretPassword123
```

If you are starting the spring application through IntelliJ or any other IDE set these in your run configuration.

#### Run with docker-compose (recommended)

First modify the mail enviroment variables in the `docker-compose.yaml`.

```sh
# To build locally use --build instead of --no-build
docker-compose up --no-build
```

#### Run image with docker
```sh
docker run -p 8080:8080 ghcr.io/eistbaren/server:latest \
-e SPRING_MAIL_HOST=mymail.website.com \
-e SPRING_MAIL_USERNAME=myemail@website.com \
-e SPRING_MAIL_PASSWORD=secretPassword123
```

#### Run using gradle

```sh
export SPRING_MAIL_HOST=mymail.website.com \
       SPRING_MAIL_USERNAME=myemail@website.com \
       SPRING_MAIL_PASSWORD=secretPassword123
./gradlew bootRun
```

#### Build jar using gradle and run jar

```sh
export SPRING_MAIL_HOST=mymail.website.com \
       SPRING_MAIL_USERNAME=myemail@website.com \
       SPRING_MAIL_PASSWORD=secretPassword123
./gradlew bootJar
java -jar build/libs/eist-0.0.1-SNAPSHOT.jar
```
