# REST API with Spring Boot and MySQL
This is a RESTful API with simple CRUD operations using Spring Boot, MySql, Jpa and Hibernate.
## Steps to Setup
#### Clone the repository
```
$ git clone https://github.com/zakmakhlouf/Spring-Boot-MovieList-Rest-Api.git
```
#### Modify application.properties in src/main/resources for your environment and run the application
```
$ mvn spring-boot:run
```
## Testing the API using Postman
| URL | HTTP Verb | POST Body | Result |
| :---: | :---: | --- | --- |
| `/api/movies` | GET | empty | show all movies |
| `/api/movies` | POST | JSON string | create new movie |
| `/api/movies/{id}` | GET | empty | show single movie |
| `/api/movies/{id}` | PUT | JSON string | update an existing movie |
| `/api/movies/{id}` | DELETE | empty | delete existing movie |


