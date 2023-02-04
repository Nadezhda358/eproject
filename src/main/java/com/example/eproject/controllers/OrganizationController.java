package com.example.eproject.controllers;

import com.example.eproject.entities.Organization;
import com.example.eproject.entities.Student;
import com.example.eproject.repositories.OrganizationRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    OrganizationRepository organizationRepository;
    @PostMapping("/submit")
    private String saveOrganizations(@Valid Organization organization, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "sign-in-organization";
        }
        organizationRepository.save(organization);
        return "organization-events";
    }
    @GetMapping("/create")
    private String createOrganization(Model model) {
        Organization organization = new Organization();
        model.addAttribute("organization", organization);
        return "sign-in-organization";
    }
}
