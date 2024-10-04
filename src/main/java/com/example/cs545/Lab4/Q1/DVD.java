package com.example.cs545.Lab4.Q1;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("DVD")
public class DVD extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String genre;
}
