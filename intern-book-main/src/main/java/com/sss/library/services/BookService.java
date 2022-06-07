package com.sss.library.services;

import com.sss.library.entities.Book;
import com.sss.library.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo repository;

    public Book saveProduct(Book book) {
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return (List<Book>) repository.findAll();
    }

    public Book getBookByID(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Book> getBookByTitle(String text) {
        return repository.findByTitle(text);
    }
}
