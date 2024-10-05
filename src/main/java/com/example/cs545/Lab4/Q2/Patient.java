package com.example.cs545.Lab4.Q2;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@SecondaryTable(name = "address",
pkJoinColumns = {@PrimaryKeyJoinColumn(name = "patient_id")})
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(table = "address")
    private String street;

    @Column(table = "address")
    private String city;

    @Column(table = "address")
    private String zip;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments = new ArrayList<>();
}

