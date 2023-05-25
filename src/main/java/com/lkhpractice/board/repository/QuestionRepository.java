package com.lkhpractice.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lkhpractice.board.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
