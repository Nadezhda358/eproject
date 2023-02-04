package com.example.eproject.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/choose-role")
    public String chooseRole(Model model){
        return "index";
    }
}
