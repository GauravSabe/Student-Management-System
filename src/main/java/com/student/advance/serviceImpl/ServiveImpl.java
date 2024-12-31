package com.student.advance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.advance.entity.Student;
import com.student.advance.repository.StudentRepository;
import com.student.advance.service.StudentService;

/**
 * Service implementation for managing Student operations.
 * Implements the StudentService interface.
 */
@Service
public class ServiveImpl implements StudentService
{
    @Autowired
    StudentRepository studentRepository; // Injecting the StudentRepository dependency

    /**
     * Fetches all students from the database.
     */
    @Override
    public List<Student> getAllStudents() 
    {
        return studentRepository.findAll();
    }

    /**
     * Saves a new student or updates an existing one in the database.
     */
    @Override
    public Student saveStudent(Student student) 
    {
        return studentRepository.save(student);
    }

    /**
     * Fetches a student by their ID.
     */
    @Override
    public Student getById(Integer Id) 
    {
        return studentRepository.findById(Id).get();
    }

    /**
     * Deletes a student by their ID.
     */
    @Override
    public void deleteById(Integer id) 
    {	
        studentRepository.deleteById(id);
    }
}
