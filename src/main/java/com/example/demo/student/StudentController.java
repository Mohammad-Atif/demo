package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
        Implementation of API layer, it receives GET,POST,PUT,DELETE request from the frontend,
        It communicated to Service Layer for all the business logic.
 */
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // @Autowired - for dependency injection , inject studentService object
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }

    /*
        RequestBody - means we are taking the requestbody and map it to the student
     */
    @PostMapping
    public void registerNewStudent(@RequestBody Student student)
    {
        studentService.addNewStudent(student);
    }

    // it will grab student id from the path variable
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId)
    {
        studentService.deleteStudent(studentId);
    }
}
