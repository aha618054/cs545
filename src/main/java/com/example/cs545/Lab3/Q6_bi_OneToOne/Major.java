package com.example.cs545.Lab3.Q6_bi_OneToOne;

import jakarta.persistence.*;

//@Entity
public class Major {
    @Id
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
