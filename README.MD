# Spring Web MVC - RESTFULL API

## Description
This project is a simple RESTFULL API using Spring Web MVC.

## Requirements
- Java 17

## How to run
- Clone this repository
- Run the command `./mvnw spring-boot:run` in the root folder
- Open your browser and go to `http://localhost:8080`
- You can use the following endpoints:
    - `http://localhost:8080/api/v1/employees` - GET - Get all employees
    - `http://localhost:8080/api/v1/employees/{id}` - GET - Get employee by id
    - `http://localhost:8080/api/v1/employees` - POST - Create a new employee
    - `http://localhost:8080/api/v1/employees/{id}` - PUT - Update an employee
    - `http://localhost:8080/api/v1/employees/{id}` - DELETE - Delete an employee
- You can use the following JSON to create or update an employee:
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
- [LinkedIn](https://www.linkedin.com/in/ibsen-gabriel-santos)
- [Iago]
- [LinkedIn](https://www.linkedin.com/in/iago-oliveira-4b5b3a1b0/)

## License
This project is under the license [MIT](./LICENSE)
