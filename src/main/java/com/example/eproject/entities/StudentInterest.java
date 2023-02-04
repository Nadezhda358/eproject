package com.example.eproject.entities;

import jakarta.persistence.*;

@Entity
public class StudentInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Interest interest;
    @ManyToOne
    private Student student;
}
