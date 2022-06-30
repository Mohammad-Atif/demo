package com.example.demo.student;

/*
        This is serve as basic Service Layer which contains all the business logic.
 */

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


// @Component - tells that this class needs to be instantiated , it is a bean
// @Service more concise way a semantics telling more specifically  that it is a service
@Service
public class StudentService {



    public List<Student> getStudents()
    {
        return List.of(new Student(1L,
                "Atif",
                "atif@gmail.com",
                LocalDate.of(2001, Month.JULY,8),
                20));
    }
}
