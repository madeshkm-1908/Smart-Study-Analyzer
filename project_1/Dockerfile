FROM eclipse-temurin:8-jdk-alpine

WORKDIR /app

# Copy only your code files (not lib folder)
COPY *.jsp .
COPY WEB-INF WEB-INF/
COPY Main.java .
COPY MANIFEST.MF .

# Create lib folder and download all dependencies
RUN mkdir -p lib && \
    cd lib && \
    wget -q https://repo1.maven.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/9.0.82/tomcat-embed-core-9.0.82.jar && \
    wget -q https://repo1.maven.org/maven2/org/apache/tomcat/embed/tomcat-embed-jasper/9.0.82/tomcat-embed-jasper-9.0.82.jar && \
    wget -q https://repo1.maven.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/9.0.82/tomcat-embed-el-9.0.82.jar && \
    wget -q https://repo1.maven.org/maven2/org/eclipse/jdt/ecj/3.33.0/ecj-3.33.0.jar && \
    wget -q https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.33/mysql-connector-java-8.0.33.jar && \
    wget -q https://repo1.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar && \
    wget -q https://repo1.maven.org/maven2/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar

# Compile Main.java
RUN javac -cp "lib/*" Main.java

# Create JAR file
RUN jar cvfm study-analyzer.jar MANIFEST.MF *.jsp WEB-INF Main.class

EXPOSE 8080

CMD ["java", "-cp", "study-analyzer.jar:lib/*", "Main"]
