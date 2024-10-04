package com.example.cs545.Lab4.Q2;

import jakarta.persistence.Embeddable;

@Embeddable
public class Payment {
    private String paydate;
    private Double amount;
}
