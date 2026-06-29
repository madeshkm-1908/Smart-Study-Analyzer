FROM eclipse-temurin:8-jdk-alpine

WORKDIR /app

# Copy all files (including lib folder with JARs)
COPY . .

# Compile Main.java using the lib folder
RUN javac -cp "lib/*" Main.java

# Create JAR file
RUN jar cvfm study-analyzer.jar MANIFEST.MF *.jsp WEB-INF Main.class

EXPOSE 8080

CMD ["java", "-jar", "study-analyzer.jar"]
