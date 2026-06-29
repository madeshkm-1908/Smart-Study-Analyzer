FROM eclipse-temurin:8-jdk-alpine

WORKDIR /app

# Copy all files
COPY . .

# Compile Main.java
RUN javac -cp "lib/*" Main.java

# Create JAR file (without trying to copy lib again)
RUN jar cvfm study-analyzer.jar MANIFEST.MF *.jsp WEB-INF Main.class

EXPOSE 8080

# Run with classpath pointing to lib folder
CMD ["java", "-cp", "study-analyzer.jar:lib/*", "Main"]
