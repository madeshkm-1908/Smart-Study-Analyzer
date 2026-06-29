FROM eclipse-temurin:8-jdk-alpine

WORKDIR /app

# Copy all files
COPY . .

# Compile Main.java (compilation works)
RUN javac -cp "lib/*" Main.java

# Create JAR (with manifest)
RUN jar cvfm study-analyzer.jar MANIFEST.MF *.jsp WEB-INF Main.class

# Copy lib folder into the JAR's location
RUN cp -r lib /app/lib

EXPOSE 8080

# Run with classpath including lib folder
CMD ["java", "-cp", "study-analyzer.jar:lib/*", "Main"]
