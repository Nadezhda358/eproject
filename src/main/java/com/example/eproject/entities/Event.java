package com.example.eproject.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @ManyToOne
    private Organization organization;
    private String eventTitle;
    private String eventDescription;
    private Date postDate;
    //@ManyToOne
    //OpportunityType opportunityType;
    private String opportunity;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
