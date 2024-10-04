package com.example.cs545.Lab4.Q1;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Book")
public class Book extends Product {
    private String title;
}
