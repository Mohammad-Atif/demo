package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;

/*
        Acts as data access layer
 */
public interface StudentRepository
extends JpaRepository<Student,Long> {

}
