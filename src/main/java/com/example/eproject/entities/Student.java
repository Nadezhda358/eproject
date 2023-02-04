package com.example.eproject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Size(min=2, max=30)
    private String firstName;
    @Size(min=2, max=30)
    private String secondName;
    @Size(min=2, max=30)
    private String lastName;
    private Date birthDay;
    @Size(min=2, max=300)
    private String description;
    //photo

}
