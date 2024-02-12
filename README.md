# RecieptProcessor

**Language:**
  pring Boot using  Java
  
## Steps to run the application:

1. Build the docker image

   docker build -t your-image-name:your-tag .
   
2. Run the docker container

   docker run -p 8080:8080 your-image-name:your-tag
   
## Testing APIs:

**I have used Postman for API testing:**

 1.  POST http://localhost:8080/receipts/process -> returns ID for the receipt

**Example:**

```json
{
  "retailer": "Target",
  "purchaseDate": "2022-01-01",
  "purchaseTime": "13:01",
  "items": [
    {
      "shortDescription": "Mountain Dew 12PK",
      "price": "6.49"
    },{
      "shortDescription": "Emils Cheese Pizza",
      "price": "12.25"
    },{
      "shortDescription": "Knorr Creamy Chicken",
      "price": "1.26"
    },{
      "shortDescription": "Doritos Nacho Cheese",
      "price": "3.35"
    },{
      "shortDescription": "   Klarbrunn 12-PK 12 FL OZ  ",
      "price": "12.00"
    }
  ],
  "total": "35.35"
}
```
--- 
Example Response:
```json
{
  "id": "e90462fe-34e6-4cbf-9675-8565bd48001f"
}
```
----
2.GET http://localhost:8080/receipts/e90462fe-34e6-4cbf-9675-8565bd48001f/points -> Returns the reward points 

Example Response:
```json
{
    "points": 28
}
```
---


    
     
