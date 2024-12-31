package com.student.advance.service;

import java.util.List;

import com.student.advance.entity.Student;

/**
 * Interface for defining student-related operations.
 * Provides methods for CRUD operations.
 */
public interface StudentService 
{
    /**
     * Fetches all students from the database.
     */
    public List<Student> getAllStudents();
    
    /**
     * Saves a new student or updates an existing one in the database.
     */
    public Student saveStudent(Student student);
    
    /**
     * Fetches a student by their ID.
     */
    public Student getById(Integer id);
    
    /**
     * Deletes a student by their ID.
     */
    public void deleteById(Integer id);
}
