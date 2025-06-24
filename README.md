# 🎓 Student Management System

A simple, full-stack Student Management System built with **Spring Boot**, using **Thymeleaf** for views and **JPA/Hibernate** for database interaction. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.

---

## 📌 Features

- 📋 View a list of all students  
- ➕ Add new student records  
- 📝 Edit existing student details  
- ❌ Delete student entries  
- 🎨 Thymeleaf-based HTML views  
- 🔁 Follows clean layered architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack

| Layer      | Technology                 |
|------------|----------------------------|
| Backend    | Spring Boot, Spring MVC    |
| Frontend   | Thymeleaf (HTML templates) |
| Database   | MySQL                      |
| ORM        | Spring Data JPA (Hibernate)|
| Build Tool | Maven                      |

---

## 🗂️ Project Structure

```plaintext
src/
├── controller/         # Web controllers (handles user requests)
├── entity/             # JPA entity (Student.java)
├── repository/         # StudentRepository interface
├── service/            # Service interface
├── service/impl/       # Implementation of the service
├── resources/
│   ├── templates/      # Thymeleaf views (HTML)
│   ├── static/         # CSS/JS
│   └── application.properties
```
---

## ⚙️ Prerequisites

Make sure the following are installed on your system:

- ✅ Java 17 or later  
- ✅ Maven  
- ✅ MySQL  
- ✅ IDE (IntelliJ IDEA recommended)

---

## 🛠️ Database Setup

1. **Open MySQL** and run this command to create the database:

    ```sql
    CREATE DATABASE sms;
    ```

2. ✅ That’s it! No need to create tables manually — Hibernate will handle it.

---

## 🔧 Configuration – `application.properties`

### 🐬 **MySQL Configuration**

spring.datasource.url=jdbc:mysql://localhost:3306/sms?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false<br/>
spring.datasource.username=root<br/>
spring.datasource.password=<br/>

### 🛠️ Hibernate Configuration
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect<br/>
spring.jpa.hibernate.ddl-auto=update<br/>

### 🧾 Show SQL in Console

logging.level.org.hibernate.SQL=DEBUG<br/>

---

## 🚀 How to Run

| Step | Action |
|------|--------|
| 1️⃣  | **Clone the repository:**<br>`git clone https://github.com/aryika78/StudentManagementSystem.git` |
| 2️⃣  | **Navigate into the project folder:**<br>`cd StudentManagementSystem` |
| 3️⃣  | **Run the app using Maven:**<br>`mvn spring-boot:run` |
| 4️⃣  | **OR open the project in IntelliJ and run**<br>`StudentManagementSystemApplication.java` |
| 5️⃣  | **Open your browser and go to:**<br>[http://localhost:8080/students](http://localhost:8080/students) |


## 🌐 Endpoints Summary

| **HTTP Method** | **Endpoint URL**          | **Description**                     |
|-----------------|---------------------------|-------------------------------------|
| GET             | `/students`               | List all students                   |
| GET             | `/students/new`           | Show form to add a student          |
| POST            | `/students`               | Save a new student                  |
| GET             | `/students/edit/{id}`     | Show form to edit student           |
| POST            | `/students/{id}`          | Update student by ID                |
| GET             | `/students/delete/{id}`   | Delete student by ID                |


## 👩‍💻 Author
- Aryika Patni

## 📄 License
This project is licensed under the MIT License.
You can freely use, modify, and distribute it.
