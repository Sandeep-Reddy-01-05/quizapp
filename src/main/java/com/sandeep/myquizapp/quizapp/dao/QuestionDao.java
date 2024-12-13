package com.sandeep.myquizapp.quizapp.dao;

import com.sandeep.myquizapp.quizapp.model.ProgrammingQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<ProgrammingQuestions,Integer> {

    List<ProgrammingQuestions> findByCategory(String category);
    List<ProgrammingQuestions> findByDifficultyLevel(String difficultyLevel);

}
