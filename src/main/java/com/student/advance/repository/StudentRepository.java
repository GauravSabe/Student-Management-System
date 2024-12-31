package com.student.advance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.advance.entity.Student;

/**
 * Repository interface for performing database operations on the Student entity.
 * Extends JpaRepository to provide CRUD operations and more.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> 
{
    // No additional methods required; JpaRepository provides basic CRUD operations.
}
