FROM openjdk:8-jre

RUN mkdir -p /app/itoken

COPY itoken-config-1.0.0-SNAPSHOT.jar /app/itoken/

CMD java -jar  /app/itoken/itoken-config-1.0.0-SNAPSHOT.jar --spring.profiles.active=prod

EXPOSE 8888
