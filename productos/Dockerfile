FROM openjdk:11
VOLUME /tmp
EXPOSE 8081
ADD ./target/productos-0.0.1-SNAPSHOT.jar productos.jar
ENTRYPOINT ["java","-jar","/productos.jar"]