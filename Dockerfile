FROM openjdk:17
WORKDIR /usr/src/myapp
COPY target/docker-demo.jar /usr/src/myapp 

EXPOSE 8086



CMD ["java", "-jar", "docker-demo.jar"]

