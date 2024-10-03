package com.example.cs545.Lab3.Q5_uni_OneToOne;

import jakarta.persistence.*;

//@Entity
public class Book {
    @Id
    private int id;
    private String title;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private Author author;
}
