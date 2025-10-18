# Use Maven with Eclipse Temurin JDK 17 as base image
FROM maven:3.9-eclipse-temurin-17

# Set working directory
WORKDIR /app

# Copy pom.xml first for better caching
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline -B

# Copy source code
COPY src src

# Build the application
RUN mvn clean package -DskipTests

# Use Eclipse Temurin JRE 17 runtime image
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=0 /app/target/edu-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
