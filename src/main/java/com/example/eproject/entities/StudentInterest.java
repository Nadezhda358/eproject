package com.example.eproject.entities;

import jakarta.persistence.*;

@Entity
public class StudentInterest {
    @ManyToMany
    private Interest interest;
    @ManyToMany
    private Student student;
}
