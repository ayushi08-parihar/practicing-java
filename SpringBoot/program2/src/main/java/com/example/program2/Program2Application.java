package com.example.program2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Program2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Program2Application.class, args);
		Student student = context.getBean(Student.class);
		student.study();
		System.out.println("Program running");
	}

}
