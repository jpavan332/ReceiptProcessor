FROM openjdk:17
EXPOSE 8080
ADD target/receiptprocessor.jar receiptprocessor.jar
ENTRYPOINT ["java", "-jar", "/receiptprocessor.jar"]
