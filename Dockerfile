FROM openjdk:8-alpine as builder
WORKDIR /home/maven/src
COPY . /home/maven/src
RUN ./mvnw clean install


FROM openjdk:8-alpine
LABEL mantainer="Bruno Nogueira <ti.brunonogueira at gmail.com>"
WORKDIR /app
COPY --from=builder /home/maven/src/target/*.jar caching.jar
ENTRYPOINT ["java", "-jar", "/app/caching.jar"]