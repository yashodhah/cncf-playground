FROM alpine/java:21-jdk
MAINTAINER h.yashodha
COPY target/payment-service-1.0-SNAPSHOT.jar payment-service.jar
ENTRYPOINT ["java","-jar","/payment-service.jar"]
