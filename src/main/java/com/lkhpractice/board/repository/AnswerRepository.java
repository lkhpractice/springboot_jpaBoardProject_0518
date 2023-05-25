package com.lkhpractice.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lkhpractice.board.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
