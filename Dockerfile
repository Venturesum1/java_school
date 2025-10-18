# Use Maven with OpenJDK 17 as base image
FROM maven:3.9-openjdk-17-slim

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

# Use OpenJDK 17 runtime image
FROM openjdk:17-jre-slim

# Set working directory
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=0 /app/target/edu-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
