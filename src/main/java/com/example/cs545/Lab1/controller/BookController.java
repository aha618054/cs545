package com.example.cs545.Lab1.controller;

import com.example.cs545.Lab1.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Spring in Action", "978-1617294945"));
        books.add(new Book(2, "Effective Java", "978-0134686097"));
        return books;
    }
}
