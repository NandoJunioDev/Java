
# Fase 1: Construção do JAR com Maven
FROM maven:3.9.0-eclipse-temurin-17 AS builder
WORKDIR /app

# Copia o POM primeiro para aproveitar o cache do Docker
COPY pom.xml .
RUN mvn dependency:go-offline

# Agora copia os fontes e faz o build da aplicação
COPY src ./src
RUN mvn clean package -DskipTests

# Fase 2: Criando a imagem final com OpenJDK
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia o JAR gerado na fase anterior
COPY --from=builder /app/target/*.jar /app/app.jar

# Expõe a porta 8080
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
