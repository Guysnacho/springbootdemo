package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Mariam = new Student("Mariam", "mariam.jamal@gmail.com", 20,
                    LocalDate.of(2000, Month.DECEMBER, 23));

            Student Alex = new Student("Alex", "alex.jamal@gmail.com", 20, LocalDate.of(2000, Month.DECEMBER, 23));
        };
    }
}
