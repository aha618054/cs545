package com.example.cs545.Lab3.Q6_bi_OneToOne;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private int age;

    @OneToOne(mappedBy = "student")
    private Major major;
}
