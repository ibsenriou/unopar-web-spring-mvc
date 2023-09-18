# Spring Web MVC - RESTFULL API

## Description
This project is a simple RESTFULL API using Spring Web MVC.

## Requirements
- Java 17

## How to run
- Clone this repository
- Run the Application.java file
- Open your browser and go to `http://localhost:8080`
- You can use the following endpoints:
    - `http://localhost:8080/users` - GET - Get all users
    - `http://localhost:8080/users/{id}` - GET - Get user by id
    - `http://localhost:8080/users` - POST - Create a new user
    - `http://localhost:8080/users/{id}` - PUT - Update a user
    - `http://localhost:8080/users/{id}` - DELETE - Delete a user
- You can use the following JSON to create or update a user:
```json
{
    "name": "John Doe",
    "email": "jhon@doe.com",
    "telefone": "99999999999",
    "password": "123456"
}
```

## Authors
- [Ibsen Gabriel Santos]
- [LinkedIn](https://www.linkedin.com/in/ibsen-gabriel-santos-359377170/)

## License
This project is under the license [MIT](./LICENSE)
