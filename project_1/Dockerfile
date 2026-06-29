FROM tomcat:9-jdk11

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your entire project (all JSP files + WEB-INF) to ROOT
COPY . /usr/local/tomcat/webapps/ROOT/

# Download MySQL connector directly into Tomcat's lib
ADD https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.33/mysql-connector-java-8.0.33.jar /usr/local/tomcat/lib/

EXPOSE 8080

CMD ["catalina.sh", "run"]
