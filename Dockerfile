FROM openjdk:8-alpine

COPY target/uberjar/time-zone-api.jar /time-zone-api/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/time-zone-api/app.jar"]
