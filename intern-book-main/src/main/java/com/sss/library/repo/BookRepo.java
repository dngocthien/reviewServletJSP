package com.sss.library.repo;

import com.sss.library.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Long> {

    List<Book> findByTitle(String title);

//    List<Book> findByAuthor(String author);

    List<Book> findByTitleContaining(String text);

    void deleteByTitle(String title);
}
