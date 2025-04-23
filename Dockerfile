# Etapa 1: build com Maven + Java 21 (última versão LTS estável suportada no Maven)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: runtime com Java 24
FROM eclipse-temurin:24-jdk
WORKDIR /app
COPY --from=build /app/target/gerenciador_de_tarefas-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
