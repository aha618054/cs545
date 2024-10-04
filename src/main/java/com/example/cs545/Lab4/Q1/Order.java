package com.example.cs545.Lab4.Q1;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    @ManyToOne
    private Customer customer;

    @OneToMany
    @JoinColumn(name = "order_id")
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();
}
