package com.example.demo;

import org.springframework.boot.SpringApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.demo.student.Student;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(1L, "Mac", "mac.mald@gmail.com", 21, LocalDate.of(1999, Month.JANUARY, 12)));
	}
}
