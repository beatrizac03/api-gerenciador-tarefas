# Etapa 1: build da aplicação com Java 24
FROM maven:3.9.4-eclipse-temurin-24 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: imagem final com Java 24
FROM eclipse-temurin:24-jdk
WORKDIR /app
COPY --from=build /app/target/gerenciador_de_tarefas-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
