package com.example.eproject.entities;

import jakarta.persistence.*;

@Entity
public class EventOpportunityType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Event event;
    @ManyToOne
    private OpportunityType opportunityType;
}
