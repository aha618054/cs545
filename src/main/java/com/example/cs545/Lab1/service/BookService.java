package com.example.cs545.Lab1.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.cs545.Lab1.model.Book;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    private final RestTemplate restTemplate;

    public BookService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Book> fetchBooks() {
        Book[] books = restTemplate.getForObject("http://localhost:8080/books", Book[].class);
        return Arrays.asList(books);
    }
}

