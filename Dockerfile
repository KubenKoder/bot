FROM maven:3.6.0-jdk-11-slim AS build

COPY pom.xml /pom.xml
COPY src /src/

RUN mvn clean package -f /pom.xml

FROM openjdk:12

ENV DISCORD_TOKEN=ABC123

COPY --from=build /target/KubenBot-jar-with-dependencies.jar /KubenBot.jar

CMD /usr/bin/java -jar /KubenBot.jar $DISCORD_TOKEN
