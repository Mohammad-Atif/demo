package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/*
        Acts as data access layer
 */
public interface StudentRepository
extends JpaRepository<Student,Long> {

    // Optional is a container object which may or may not contain a non-null value.
    // If a value is present, isPresent() will return true and get() will return the value
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
