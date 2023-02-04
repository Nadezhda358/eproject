package com.example.eproject.controllers;

import com.example.eproject.entities.Event;
import com.example.eproject.repositories.EventRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.time.LocalDate;


@Controller
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventRepository eventRepository;
    @GetMapping("/create")
    private String createEvent(Model model) {
        Event event = new Event();
        model.addAttribute("event", event);
        return "add-event";
    }
    @PostMapping("/submit")
    private String saveEvents(@Valid Event event, BindingResult bindingResult){

        if (bindingResult.hasErrors()){// || LocalDate.now().isAfter(event.getEndDate())) {
            return "add-event";
        }
        event.setPostDate(LocalDate.now());
        eventRepository.save(event);
        return "organization-events";
    }
}
