package com.example.cs545.Lab4.Q1;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CD")
public class CD extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String artist;

}
