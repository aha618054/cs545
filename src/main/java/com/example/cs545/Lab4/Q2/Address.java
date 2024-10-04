package com.example.cs545.Lab4.Q2;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
