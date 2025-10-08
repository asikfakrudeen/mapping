package com.softsuave.mapping.dao;

import com.softsuave.mapping.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}