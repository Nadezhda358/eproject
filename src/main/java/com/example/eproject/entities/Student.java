package com.example.eproject.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String secondName;
    private String lastName;
    //private datetime birthDay;
    private Date date;
    private String description;
    //photo

}
