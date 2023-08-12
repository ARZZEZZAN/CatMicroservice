FROM alpine:3.13

RUN apk add openjdk11

COPY app.jar /app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]