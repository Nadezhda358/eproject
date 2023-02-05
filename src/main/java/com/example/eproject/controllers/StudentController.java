package com.example.eproject.controllers;

import com.example.eproject.entities.Event;
import com.example.eproject.entities.Interest;
import com.example.eproject.entities.Organization;
import com.example.eproject.entities.Student;
import com.example.eproject.repositories.InterestRepository;
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
    @Autowired
    InterestRepository interestRepository;
    @PostMapping("/submit")
    private String saveStudents(@Valid Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "sign-in-student";
        }
        studentRepository.save(student);
        //return "redirect:/student-events";
        return "redirect:/event/all-events-student";
    }
    @GetMapping("/create")
    private String createStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        Iterable<Interest> interests = interestRepository.findAll();
        model.addAttribute("interests", interests);
        return "sign-in-student";
    }
}
