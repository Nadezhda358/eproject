package com.example.eproject.entities;

import jakarta.persistence.*;

@Entity
public class StudentInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany
    private Interest interest;
    @ManyToMany
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
