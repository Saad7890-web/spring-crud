package com.codeprophet.controller;

import com.codeprophet.model.Book;
import com.codeprophet.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/books/all")
    public List<Book> findAll(){
        return bookService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Book>findById(@PathVariable Long id){
        return bookService.findById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/books/all")
    public Book create(Book book){
        return bookService.save(book);
    }

    @PutMapping
    public Book update(Book book){
        return bookService.save(book);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        bookService.deleteById(id);
    }
    @GetMapping("/find/title/{title}")
    public List<Book>findByTitle(String title){
        return bookService.findByTitle(title);
    }
    @GetMapping("/find/date-after/{date}")
    public List<Book>findByPublishedDateAfter(@PathVariable @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate date){
        return bookService.findByPublishedDateAfter(date);
    }


}
