package com.example.cs545.Lab4.Q1;

import jakarta.persistence.*;

@Entity
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
