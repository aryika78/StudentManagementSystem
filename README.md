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
│   ├── static/         # CSS/JS (if any)
│   └── application.properties
⚙️ Configuration
application.properties

# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/sms?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=root
spring.datasource.password=

# JPA / Hibernate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

# Show SQL logs in console
logging.level.org.hibernate.SQL=DEBUG
✅ Make sure you have a database named sms in your MySQL:

CREATE DATABASE sms;
🚀 Running the Application
Prerequisites
Java 17 or above

MySQL Server installed and running

Maven installed

Steps to Run
Clone the repository

git clone https://github.com/aryika78/StudentManagementSystem.git
cd StudentManagementSystem
Start MySQL and ensure the sms database is created.

Run the application

mvn spring-boot:run
Open in browser
👉 http://localhost:8080/students

🔗 Endpoints Summary
Method	Endpoint	Description
GET	/students	View all students
GET	/students/new	Show add form
POST	/students	Add new student
GET	/students/edit/{id}	Show edit form
POST	/students/{id}	Update student
GET	/students/delete/{id}	Delete a student

🧑‍💻 Author
Aryika Patni

📜 License
This project is licensed under the MIT License.
Feel free to use, modify, and distribute it for learning or development purposes.