package com.example.cs545.Lab2.controller;

import com.example.cs545.Lab2.model.Book;
import com.example.cs545.Lab2.service.BookServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControllerV1 {

    @Autowired
    private BookServiceV1 bookService;

    // Media Type (Content Negotiation) and URI Versioning
    @GetMapping(value = "/v1", produces = "application/vnd.example.v1+json")
    public List<Book> getAllBooksV1() {
        return bookService.findAll();
    }

    @GetMapping(value = "/v2", produces = "application/vnd.example.v2+json")
    public List<Book> getAllBooksV2() {
        return bookService.findAll();
    }

    @GetMapping(value = "/v3", produces = "application/vnd.example.v3+json")
    public List<Book> getAllBooksV3() {
        return bookService.findAll();
    }

    @GetMapping(value = "/v4", produces = "application/vnd.example.v4+json")
    public List<Book> getAllBooksV4() {
        return bookService.findAll();
    }

    // Get Book by ID with URI Versioning
    @GetMapping(value = "/v1/{id}", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Book> getBookByIdV1(@PathVariable int id) {
        Book book = bookService.findById(id);
        return book != null ? ResponseEntity.ok(book) : ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/v2/{id}", produces = "application/vnd.example.v2+json")
    public ResponseEntity<Book> getBookByIdV2(@PathVariable int id) {
        Book book = bookService.findById(id);
        return book != null ? ResponseEntity.ok(book) : ResponseEntity.notFound().build();
    }

    // Header Versioning for creating books
    @PostMapping(consumes = "application/vnd.example.v1+json")
    public Book createBookV1(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PostMapping(consumes = "application/vnd.example.v2+json")
    public Book createBookV2(@RequestBody Book book) {
        return bookService.save(book);
    }

    // Header Versioning for updating books
    @PutMapping(value = "/{id}", consumes = "application/vnd.example.v1+json")
    public ResponseEntity<Book> updateBookV1(@PathVariable int id, @RequestBody Book bookDetails) {
        Book updatedBook = bookService.update(id, bookDetails);
        return updatedBook != null ? ResponseEntity.ok(updatedBook) : ResponseEntity.notFound().build();
    }

    @PutMapping(value = "/{id}", consumes = "application/vnd.example.v2+json")
    public ResponseEntity<Book> updateBookV2(@PathVariable int id, @RequestBody Book bookDetails) {
        Book updatedBook = bookService.update(id, bookDetails);
        return updatedBook != null ? ResponseEntity.ok(updatedBook) : ResponseEntity.notFound().build();
    }

    // Request Parameter Versioning for deleting books
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteBook(
            @PathVariable int id,
            @RequestParam(value = "version", defaultValue = "1") int version) {
        boolean isDeleted = bookService.delete(id);
        return isDeleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}