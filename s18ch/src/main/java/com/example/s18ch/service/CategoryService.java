package com.example.s18ch.service;

import com.example.s18ch.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category find(long id);
    Category save(Category category);
    Category delete(long id);

}
