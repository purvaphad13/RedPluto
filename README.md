# RedPluto
Spring Boot REST API for Student CRUD operations
A simple Spring Boot REST API that performs CRUD operations on Student data
## Technologies Used

- Java 8
- Spring Boot 2.7.10
- Spring Data JPA
- MySQL
- Hibernate
- Postman (for testing)

- 
Create Student (POST)
  URL: http://localhost:8080/api/students ( body-raw-json)
{
  "name": "ram",
  "age": 21,
  "m1": 80,
  "m2": 90,
  "m3": 85,
  "m4": 95,
  "m5": 75
}

Get Student by ID (GET)
URL: http://localhost:8080/api/students/{id}
e.g. http://localhost:8080/api/students/1


Get All Students (GET)
URL: http://localhost:8080/api/students


Update Student (PUT)
URL: http://localhost:8080/api/students/{id}
e.g. http://localhost:8080/api/students/1   (body-raw-json)

Delete Student (DELETE)
URL: http://localhost:8080/api/students/{id}
e.g. http://localhost:8080/api/students/1

Search by Name (GET)
URL: http://localhost:8080/api/students/searchByName/{name}
e.g. http://localhost:8080/api/students/searchByName/ram

Search by Division (GET)
URL: http://localhost:8080/api/students/searchByDivision/{division}
e.g. http://localhost:8080/api/students/searchByDivision/First Division
