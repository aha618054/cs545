package com.example.cs545.Lab3.Q5_uni_OneToOne;
import jakarta.persistence.*;

//@Entity
public class Author {
    @Id
    private int id;
    private String firstName;
    private String lastName;
}
