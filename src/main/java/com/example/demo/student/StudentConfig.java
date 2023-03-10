package com.example.demo.student;


import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            new Student(
                    1L, "Mirriam",
                    "mirriamJamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    22
            );

        };
    }
}
