package com.example.s18ch.service;

import com.example.s18ch.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    Author find(long id);

    Author save(Author author);

    Author delete(long id);

}
