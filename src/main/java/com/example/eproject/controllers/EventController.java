package com.example.eproject.controllers;

import com.example.eproject.entities.Event;
import com.example.eproject.entities.Organization;
import com.example.eproject.repositories.EventRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;


@Controller
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventRepository eventRepository;
    @GetMapping("/create")
    private String createEvent(Model model){//, Organization organization) {
        Event event = new Event();
        model.addAttribute("event", event);
        //model.addAttribute(organization);
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
    @GetMapping("/all-events")
    public String getAllAEvents(Model model){
        Iterable<Event> events = eventRepository.findAll();
        model.addAttribute("events", events);
        return "all-events";
    }
    @GetMapping("/all-events-student")
    public String getAllAEventsStudent(Model model){
        Iterable<Event> events = eventRepository.findAll();
        model.addAttribute("events", events);
        return "all-events-student";
    }
    @PostMapping("/more-info/{eventId}")
    private String moreMoreInfo(@PathVariable(name="eventId") Integer eventId, Model model) {
        Optional<Event> oe = eventRepository.findById(eventId);
        Event event;
        if(oe.isPresent()) {
            event = oe.get();
        } else {
            event = new Event();
        }

        model.addAttribute("event", event);
        return "event-info";
    }
}
