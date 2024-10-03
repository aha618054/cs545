package com.example.cs545.Lab3.Q4_uni_OneToMany;

import jakarta.persistence.*;

//@Entity
public class Reservation {
    @Id
    private int id;
    private String title;
    private String description;
}
