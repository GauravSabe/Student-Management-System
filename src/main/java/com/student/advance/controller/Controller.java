package com.student.advance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.advance.entity.Student;
import com.student.advance.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller 
{
    @Autowired
    private StudentService service; // Dependency injection for student service

    /**
     * Handles the request to display all students.
     */
    @GetMapping("/students")
    public String getAllStudents(Model model) 
    {
        model.addAttribute("studentsObj", service.getAllStudents());
        return "students";
    }

    /**
     * Displays the form to create a new student.
     */
    @GetMapping("students/new")
    public String createStudentStringFoem(Model model) 
    {
        model.addAttribute("studentsObj1", new Student());
        return "create_student";
    }

    /**
     * Saves a new student and redirects to the list of students.
     */
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("studentObj1") Student student) 
    {
        service.saveStudent(student);
        return "redirect:/students";
    }

    /**
     * Displays the form to edit an existing student.
     */
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Integer id, Model model) 
    {
        model.addAttribute("studentObj2", service.getById(id));
        return "edit_student";
    }

    /**
     * Updates the details of an existing student.
     */
    @PostMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable Integer id, @ModelAttribute("studentObj2") Student student) 
    {
        Student existingStudent = service.getById(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        service.saveStudent(existingStudent);
        return "redirect:/students";
    }

    /**
     * Deletes a student by ID and redirects to the list of students.
     */
    @GetMapping("/students/{id}")
    public String deleteById(@PathVariable Integer id) 
    {
        service.deleteById(id);
        return "redirect:/students";
    }	
}
