# 🏫 School & Student Management System

## Overview
A backend application built with **Spring Boot** and **Spring MVC** to manage schools and student records. This system follows a clean layered architecture and is integrated with **PostgreSQL** for persistent data storage.

## Features
- 🏫 Manage school details (name, address, etc.)
- 👨‍🎓 Add, update, and delete student records
- 🔍 Retrieve student and school information
- 🧱 Layered architecture using Controller → Service → Repository pattern

## Tech Stack
- **Backend:** Spring Boot, Spring MVC
- **Database:** PostgreSQL
- **Architecture:** RESTful APIs with DTOs and model mapping

## Folder Structure
```
src/
├── controller/         --> REST API endpoints
├── service/            --> Business logic layer
├── repository/         --> JPA repository interfaces
├── model/              --> Entity classes
├── dto/                --> Data Transfer Objects
└── config/             --> Configuration files
```

## How to Run
1. Clone the repository
```bash
git clone <your-repo-url>
```
2. Open the project in an IDE (like IntelliJ or Eclipse)
3. Set up PostgreSQL and update application.properties with DB credentials
4. Run the application
```bash
./mvnw spring-boot:run
```

## API Endpoints
- `POST /api/schools` – Add a new school
- `GET /api/schools/{id}` – Get school by ID
- `POST /api/students` – Add a student
- `GET /api/students?schoolId=` – Get students by school

## Future Enhancements
- Add authentication & role-based access
- Support for pagination and filtering
- UI dashboard integration

## Author
**Srajan Gupta**

- [LinkedIn](https://www.linkedin.com/in/srajan-gupta-1038821ba/)
- [GitHub](https://github.com/srajangupta144)

## License
This project is licensed under the MIT License.

---

> "Efficient school and student data management made simple with Spring Boot."
