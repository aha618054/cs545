package com.example.cs545.Lab2.service;

import com.example.cs545.Lab2.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceV1 {
    private final List<Book> books = new ArrayList<>();
    private int currentId = 1;

    public BookServiceV1() {
        // Add some fake data
        books.add(new Book(currentId++, "Book One", "1234567890", 19.99));
        books.add(new Book(currentId++, "Book Two", "0987654321", 29.99));
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    public Book save(Book book) {
        book.setId(currentId++);
        books.add(book);
        return book;
    }

    public Book update(int id, Book bookDetails) {
        Book book = findById(id);
        if (book != null) {
            book.setTitle(bookDetails.getTitle());
            book.setIsbn(bookDetails.getIsbn());
            book.setPrice(bookDetails.getPrice());
            return book;
        }
        return null;
    }

    public boolean delete(int id) {
        return books.removeIf(book -> book.getId() == id);
    }
}
