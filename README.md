# Orders - Spring Framework ORM Exercise

## The task
This is a simple application to practice Object-related Mapping in Spring. To create a 1:1 relation, customer and address are split in two classes.

## API endpoints and database
The application can be executed via an API platform, such as Postman. The content type is json and the endpoints are:

- POST request to enter data for the customer: `http://localhost:8080/orderme/customers`, entering the following json data: 
```
{
    "name": "...",
    "address": {
        "street": "...",
        "city": "..."
    }
} 
```
An id will automatically be created.

- POST request to enter the order related to a customer: `http://localhost:8080/orderme/{id}/orders`, entering the following json data:
``` 
{
    "product": "...",
    "quantity": int,
    "price": double
}
```
- GET request: `http://localhost:8080/orderme/customers`.