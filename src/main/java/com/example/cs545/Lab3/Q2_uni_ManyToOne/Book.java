package com.example.cs545.Lab3.Q2_uni_ManyToOne;

import jakarta.persistence.*;

//@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private Publisher publisher;
}
