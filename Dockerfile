FROM openjdk:11
COPY ./target/person-receiver-0.0.1-SNAPSHOT.jar /usr/src/jms-person/
WORKDIR /usr/src/jms-person
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "person-receiver-0.0.1-SNAPSHOT.jar"]