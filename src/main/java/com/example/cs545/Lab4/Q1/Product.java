package com.example.cs545.Lab4.Q1;

import jakarta.persistence.*;

@Entity
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
}
