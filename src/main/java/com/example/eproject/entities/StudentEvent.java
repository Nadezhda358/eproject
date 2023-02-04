package com.example.eproject.entities;

import jakarta.persistence.*;

@Entity
public class StudentEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Student student;
}
