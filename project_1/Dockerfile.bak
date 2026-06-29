FROM eclipse-temurin:8-jdk-alpine

WORKDIR /app

# Copy everything (including your lib folder)
COPY . .

# Compile Main.java
RUN javac -cp "lib/*" Main.java

# Create executable JAR
RUN jar cvfm study-analyzer.jar MANIFEST.MF *.jsp WEB-INF Main.class

EXPOSE 8080

CMD ["java", "-cp", "study-analyzer.jar:lib/*", "Main"]
