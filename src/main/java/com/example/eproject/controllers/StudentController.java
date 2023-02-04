package com.example.eproject.controllers;

import com.example.eproject.entities.Student;
import com.example.eproject.repositories.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @PostMapping("/submit")
    private String saveStudents(@Valid Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "create";
        }
        studentRepository.save(student);
        return "redirect:/student-events";
    }
    @GetMapping("/create")
    private String createStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "sign-in-student";
    }
}
