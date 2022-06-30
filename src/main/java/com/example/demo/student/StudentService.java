package com.example.demo.student;

/*
        This is serve as basic Service Layer which contains all the business logic.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


// @Component - tells that this class needs to be instantiated , it is a bean
// @Service more concise way a semantics telling more specifically  that it is a service
@Service
public class StudentService {

    private final StudentRepository studentRepository;
//  dependency injection
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email already taken");
        }
        studentRepository.save(student);
    }
}
