FROM quay.io/devfile/maven:3.8.1-openjdk-17-slim
WORKDIR /build
COPY pom.xml .
COPY src src
RUN mvn clean package
FROM tomcat:latest
RUN mkdir /usr/local/tomcat/webapps-javaee
COPY --from=0 /build/target/maven-generate-war.war webapps-javaee/
RUN chgrp -R 0 /usr/local/tomcat && chmod -R g=u /usr/local/tomcat
EXPOSE 8080
CMD ["catalina.sh", "run"]
