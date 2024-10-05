package com.example.cs545.Lab5.repository;

import com.example.cs545.Lab5.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Integer> {
}
