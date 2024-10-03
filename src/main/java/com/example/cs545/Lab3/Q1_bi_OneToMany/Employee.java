package com.example.cs545.Lab3.Q1_bi_OneToMany;

import jakarta.persistence.*;
import lombok.Data;

//@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Department department;
}
