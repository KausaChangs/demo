package com.example.demo.student;


import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
//            Student mariam  = new Student(
//                    "Mariam",
//                    "mariamJamal@gmail.com",
//                    LocalDate.of(2000, JANUARY, 5)
//            );
//
//            Student alex  = new Student(
//                    "Alex",
//                    "alex.Jamal@gmail.com",
//                    LocalDate.of(2005, AUGUST, 31)
//
//            );

            repository.saveAll(
                    //List.of(mariam, alex)
                    List.of()

            );
        };
    }
}
