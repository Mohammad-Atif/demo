package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.JULY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    )
    {
        return args -> {
           Student atif = new Student(
                   "Atif",
                   "atif@gmail.com",
                   LocalDate.of(2001, JULY,8),
                   20
           );

           Student alex = new Student(
                   "Alex",
                   "alex@gmail.com",
                   LocalDate.of(2004, JANUARY,23),
                   23
           );

           repository.saveAll(List.of(atif,alex));

        };
    }
}
