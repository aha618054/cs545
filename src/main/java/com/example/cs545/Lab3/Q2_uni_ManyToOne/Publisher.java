package com.example.cs545.Lab3.Q2_uni_ManyToOne;

import jakarta.persistence.*;

//@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
