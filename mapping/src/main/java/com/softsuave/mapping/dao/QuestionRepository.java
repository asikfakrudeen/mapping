package com.softsuave.mapping.dao;


import com.softsuave.mapping.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}