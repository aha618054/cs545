package com.example.cs545.Lab3.Q3_bi_ManyToMany;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
public class Course {
    @Id
    private int id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students = new ArrayList<>();
}
