package com.tekup.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.category.model.Category;
import com.tekup.category.repository.categoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private categoryRepository repository;

    public Category saveCategory(Category category) {
        return repository.save(category);
    }

    public List<Category> saveCategories(List<Category> categories) {
        return repository.saveAll(categories);
    }

    public List<Category> getCategories() {
        return repository.findAll();
    }

    public Category getCategoryById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Category getCategoryByName(String name) {
        return repository.findByName(name);
    }

    public String deleteCategory(int id) {
        repository.deleteById(id);
        return "category removed !! " + id;
    }

    public Category updateCategory(Category category) {
        Category existingCategory = repository.findById(category.getId()).orElse(null);
        existingCategory.setNomCat(Category.get);
        existingCategory.setCodeCat(Category.get);
        return repository.save(existingCategory);
    }


}