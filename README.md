# RecieptProcessor
calculating reward points
**Language:**
  Spring Boot using  Java
  
**Steps to run the application:**

1. Build the docker image
   docker build -t your-image-name:your-tag.
2. Run the docker container
   docker run -p 8080:8080 your-image-name:your-tag

**Testing the APIs:**

 I have used **Postman** for API testing:

 1.  POST http://localhost:8080/receipts/process -- returning ID for the receipt
 2.  GET http://localhost:8080/receipts/Id/points -- returns the points awarded
     
