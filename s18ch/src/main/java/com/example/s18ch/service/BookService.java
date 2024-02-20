package com.example.s18ch.service;

import com.example.s18ch.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book find(long id);

    Book save(Book book);

    Book delete(long id);

}
