package com.student.advance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class representing a Student.
 * This class is mapped to the "students" table in the database.
 */
@Entity
@Table(name = "students")
public class Student 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Automatically generate the student ID
    private Integer id;
    
    @Column(name = "first_name") // Mapped to the "first_name" column in the table
    private String firstName;
    
    @Column(name = "last_name") // Mapped to the "last_name" column in the table
    private String lastName;
    
    @Column(name = "email") // Mapped to the "email" column in the table
    private String email;

    // Constructor with parameters to initialize all fields
    public Student(int id, String firstName, String lastName, String email) 
    {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Default constructor
    public Student() 
    {
        super();
    }

    // Getter and setter methods for the fields
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
}
