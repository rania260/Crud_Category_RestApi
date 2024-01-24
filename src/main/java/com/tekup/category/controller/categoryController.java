package com.tekup.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.category.model.Category;
import com.tekup.category.service.CategoryService;

@RestController
public class categoryController {
    
    @Autowired
    private CategoryService service;

    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category gategory) {
        return service.saveCategory(gategory);
    }

    @PostMapping("/addCategories")
    public List<Category> addCategories(@RequestBody List<Category> gategories) {
        return service.saveCategories(gategories);
    }

    @GetMapping("/Categories")
    public List<Category> findAllCategories() {
        return service.getCategories();
    }

    @GetMapping("/categoryById/{id}")
    public Category findCategoryById(@PathVariable int id) {
        return service.getCategoryById(id);
    }

    @GetMapping("/category/{name}")
    public Category findCategoryByName(@PathVariable String name) {
        return service.getCategoryByName(name);
    }

    @PutMapping("/update")
    public Category updateCategory(@RequestBody Category category) {
        return service.updateCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable int id) {
        return service.deleteCategory(id);
    }
}