package com.blogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.Entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByUsername(String username);
}