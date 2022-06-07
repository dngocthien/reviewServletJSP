package com.sss.library.controllers;

import com.sss.library.entities.Book;
import com.sss.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public List<Book> findAllProduct() {
        return service.getAllBooks();
    }

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
