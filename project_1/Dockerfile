FROM tomcat:9-jdk11

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Create ROOT directory
RUN mkdir -p /usr/local/tomcat/webapps/ROOT

# Copy ALL files from project_1 to ROOT
COPY . /usr/local/tomcat/webapps/ROOT/

# Copy MySQL connector from your lib folder (THIS WORKS)
COPY lib/mysql-connector-java-*.jar /usr/local/tomcat/lib/

EXPOSE 8080

CMD ["catalina.sh", "run"]
