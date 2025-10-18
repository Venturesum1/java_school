# Education Management System

A Spring Boot application for education management.

## 🚀 Free Deployment Options

### 1. Railway (Recommended - No Sleep Time)
1. Go to [Railway.app](https://railway.app)
2. Sign up with GitHub
3. Click "New Project" → "Deploy from GitHub repo"
4. Select this repository
5. Railway will auto-detect it's a Java app and deploy it
6. Your app will be available at `https://your-app-name.railway.app`

### 2. Render
1. Go to [Render.com](https://render.com)
2. Sign up with GitHub
3. Click "New" → "Web Service"
4. Connect your GitHub repository
5. Use these settings:
   - **Build Command**: `mvn clean package -DskipTests`
   - **Start Command**: `java -jar target/edu-0.0.1-SNAPSHOT.jar`
6. Deploy!

### 3. Fly.io
1. Install Fly CLI: `curl -L https://fly.io/install.sh | sh`
2. Run: `fly launch`
3. Follow the prompts
4. Deploy: `fly deploy`

## 🏃‍♂️ Local Development

```bash
# Run the application
mvn spring-boot:run

# Or run the JAR
java -jar target/edu-0.0.1-SNAPSHOT.jar
```

## 📡 API Endpoints

- `GET /` - Welcome message
- `GET /health` - Health check
- `GET /api/status` - Application status
- `GET /actuator/health` - Spring Boot Actuator health
- `GET /h2-console` - H2 Database Console (development only)

## 🛠️ Features

- Spring Boot 3.2.0
- Java 17
- H2 Database (in-memory)
- Spring Boot Actuator for monitoring
- RESTful API endpoints

## 📦 Build

```bash
mvn clean package
```

## 🌐 Environment Variables

- `PORT` - Server port (default: 8080)
- `SPRING_PROFILES_ACTIVE` - Active profile (default: default)
