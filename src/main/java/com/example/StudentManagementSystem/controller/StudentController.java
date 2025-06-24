package com.example.StudentManagementSystem.controller;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController
{
    private final StudentService studentService;
    //dependency injection using constructor injection method
    public StudentController(StudentService studentService)
    {
        super();
        this.studentService = studentService;
    }
    // when there are less(2-3) dependencies and dependencies are mandatory we use
    // constructor injection method. When dependencies are optional, we use field or
    // setter injection method.


    // handler method to handle list students and return mode and view
    @GetMapping("/students")
    // when we type this url in browser the following method will run.
    public String listStudents(Model model)
    {
        // Model is a container, in which we fill data using addattribute("key", value)
        // fn,brought from db to controller, now this model will carry data from controller
        //to our view(html page) so that we can ue that data which we brought from the db
        //there(in html page) using ${key}

        model.addAttribute("students", studentService.getAllStudents());

        // the upper students is the key name of this fn

        return "students";

        // this students is the name of the html file(view) that we are rendering, means
        // where we will use the upper data.

        // name of key and view need not be the same.
    }
    @GetMapping("/students/new")
    public String createStudentForm(Model model)
    {

        // create student object to hold student data from the form
        Student student = new Student();
        model.addAttribute("student", student); // Ye object ko model(key) me daal raha hai, taaki Thymeleaf template me ye object available ho.
        //Thymeleaf form me jab tum th:object="${student}" likhti ho, to Thymeleaf is model attribute ko use karta hai student onj ko dhundhne k liye.
        //ye jo empty obj hai, wo student key k through create student me pohchega , jaha hum usme user jo data enter karega use bind karenge, Student class ki fields k sath.
        return "create_student";

    }
    //yaha pe values se filled student obj return hoga and id field names form k aur student class k match karenge to ye user ka entered data student class ki fields me set kar dega

    //@ModelAttribute("student") ka kaam hai form me jo data user enter karta hai (like firstName, lastName, email), us data ko bind karke Student object me fill karna.
    //Agar form submit hota hai aur fields match karte hain (firstName, lastName, email), to Spring Boot automatically form data ko Student class ke properties me set kar deta hai
    @PostMapping("/students") //this will run on form submission as its method is post
    public String saveStudent(@ModelAttribute("student") Student student)
    {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    // to bind the id to a java var , we use pathvariable
    public String editStudentForm(@PathVariable Long id, Model model)
    {
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
     public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student)
    {
        //get student by id from db
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(student.getId());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        //save updated student obj
        studentService.updateStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
