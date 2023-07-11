FROM tomcat:8.5.91-jdk21-openjdk
COPY /target/ROOT.war /usr/local/tomcat/webapps/
#FROM openjdk:19
#ADD /target/Library-1.0-SNAPSHOT.jar backend.jar
#ENTRYPOINT ["java", "-jar", "Library-1.0-SNAPSHOT.jar"]