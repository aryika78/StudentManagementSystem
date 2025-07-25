package com.example.StudentManagementSystem;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner
{

	public static void main(String[] args)
	{
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	 //executes when we run our spring boot application.

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception
	{
		/*Student student1 = new Student("Aryika", "Patni", "aryika@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Akshat", "Mistry", "akshat@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Dhruv", "Jaradi", "jaradaa@gmail.com");
		studentRepository.save(student3);*/
	}
}
