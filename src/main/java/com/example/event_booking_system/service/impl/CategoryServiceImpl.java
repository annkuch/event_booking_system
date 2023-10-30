package com.example.event_booking_system.service.impl;

import com.example.event_booking_system.models.event.Category;
import com.example.event_booking_system.repository.CategoryRepository;
import com.example.event_booking_system.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository  categoryRepository;
    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @Override
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
