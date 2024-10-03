package com.example.cs545.Lab3.Q3_bi_ManyToMany;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
public class Student {
    @Id
    private int id;
    private String name;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses = new ArrayList<>();
}
