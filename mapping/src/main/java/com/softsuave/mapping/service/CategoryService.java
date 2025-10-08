package com.softsuave.mapping.service;

import com.softsuave.mapping.entity.Category;
import com.softsuave.mapping.entity.Question;
import com.softsuave.mapping.dao.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        if (category.getQuestions() != null) {
            for (Question q : category.getQuestions()) {
                q.setCategory(category);
            }
        }
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}