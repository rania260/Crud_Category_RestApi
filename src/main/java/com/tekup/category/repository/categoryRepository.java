package com.tekup.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.category.model.Category;

public interface categoryRepository extends JpaRepository<Category, Integer> {

    Category findByName(String name);
    
}