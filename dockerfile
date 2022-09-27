FROM openjdk:17
LABEL maintainer="com.Springboot"
ADD target/CustomerSpringboot-0.0.1-SNAPSHOT.jar CustomerSpringboot.jar
ENTRYPOINT ["java","-jar","CustomerSpringboot.jar" ]