package com.example.cs545.Lab3.Q4_uni_OneToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservations = new ArrayList<>();
}
