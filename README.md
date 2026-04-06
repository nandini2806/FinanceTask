This project is a backend application for a Finance Dashboard System.
The system allows users to manage financial records such as income and expenses and provides summary analytics for a dashboard.

Different users have different permissions using role-based access control.
Example:
Viewer → Can only see dashboard data
Analyst → Can view financial records and analytics
Admin → Can create, update, and delete records and manage users

The project is built using Java and Spring Boot.
Technologies Used
Java
Spring Boot
Spring Security (Basic Authentication)
Spring Data JPA
Hibernate Validator
MySQL Database
Maven
Lombok
Postman (for API testing)
Project Dependencies


The following dependencies are used in this project.
1. Spring Boot Starter Web
Used to build REST APIs.
spring-boot-starter-web

2. Spring Boot Starter Data JPA
Used to interact with the database using JPA and Hibernate.
spring-boot-starter-data-jpa

3. MySQL Driver
Used to connect the application with MySQL database.
mysql-connector-j

4. Spring Boot Starter Security
Used to implement authentication and role-based access control.
spring-boot-starter-security
Authentication type used in this project:
Basic Authentication

5. Validation Dependency
Used for validating input fields like amount, name, etc.
spring-boot-starter-validation
Example validations used:
NotNull
NotBlank
Positive

6. Lombok
Used to reduce boilerplate code like getters, setters, constructors.

Database Design
The system uses a MySQL database to store data.

Two main tables are used.
1. User Table
This table stores user information and roles.
Fields:
id Unique user ID
name User name
email User email
password Password for authentication
role User role (ADMIN / ANALYST / VIEWER)
active User status (true or false)


2. Financial Record Table
This table stores income and expense records.
Fields:
Column Description
id Record ID
amount Transaction amount
type INCOME or EXPENSE
category Category like food, travel, salary
date Transaction date
notes Additional description


API Endpoints
User APIs
Create User
POST /users
Get All Users
GET /users

Financial Record APIs
Create Record
POST /records
Get All Records
GET /records
Update Record
PUT /records/{id}
Delete Record

Dashboard APIs
Get total income, expense and balance
GET /dashboard/summary


Authentication
The system uses Basic Authentication.
Example credentials:
Username: admin
Password: admin123

When calling APIs using Postman, select:
Authorization → Basic Auth
Enter the username and password.
Validation and Error Handling
The system validates user input before saving data.


Error responses return proper HTTP status codes.
Example:
400 → Bad Request
401 → Unauthorized
403 → Forbidden
404 → Not Found


Configure database in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Future improvements can include:
JWT authentication
Pagination for large data
Advanced analytics
Frontend dashboard integration
User specific financial records


This backend system demonstrates a structured REST API design with role-based access control, data validation, and financial data management suitable for a finance dashboard application.
