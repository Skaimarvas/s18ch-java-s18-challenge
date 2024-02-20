package com.example.s18ch.controller;


import com.example.s18ch.dto.CategoryResponse;
import com.example.s18ch.entity.Category;
import com.example.s18ch.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/workintech/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public CategoryResponse save(@RequestBody Category category){
        Category savedCategory = categoryService.save(category);
        return new CategoryResponse(savedCategory.getId(), savedCategory.getCategoryName());
    }
    @GetMapping("/{id}")
    public CategoryResponse get(@PathVariable long id){
        Category category = categoryService.find(id);
        return new CategoryResponse(category.getId(), category.getCategoryName());
    }



}
