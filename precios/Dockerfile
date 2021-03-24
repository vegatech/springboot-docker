FROM openjdk:11
VOLUME /tmp
EXPOSE 8082
ADD ./target/precios-0.0.1-SNAPSHOT.jar precios.jar
ENTRYPOINT ["java","-jar","/precios.jar"]