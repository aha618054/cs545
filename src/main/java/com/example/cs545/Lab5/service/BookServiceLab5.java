package com.example.cs545.Lab5.service;

import com.example.cs545.Lab5.model.Books;
import com.example.cs545.Lab5.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceLab5 {
    @Autowired
    private BookRepository bookRepository;

    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Books> getBookById(int id) {
        return bookRepository.findById(id);
    }

    public Books addBook(Books book) {
        return bookRepository.save(book);
    }

    public Books updateBook(int id, Books bookDetails) {
        return bookRepository.findById(id).map(book -> {
            book.setTitle(bookDetails.getTitle());
            book.setIsbn(bookDetails.getIsbn());
            book.setPrice(bookDetails.getPrice());
            return bookRepository.save(book);
        }).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
