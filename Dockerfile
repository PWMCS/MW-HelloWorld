FROM quay.io/devfile/maven:3.8.1-openjdk-17-slim
WORKDIR /build
COPY pom.xml .
COPY src src
RUN mvn clean package
FROM tomcat:9.0
COPY --from=0 /build/target/maven-generate-war.war webapps/
RUN chgrp -R 0 /usr/local/tomcat && chmod -R g=u /usr/local/tomcat
