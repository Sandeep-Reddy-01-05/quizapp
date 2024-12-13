package com.sandeep.myquizapp.quizapp.service;

import com.sandeep.myquizapp.quizapp.dao.QuestionDao;
import com.sandeep.myquizapp.quizapp.model.ProgrammingQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
@Autowired
    QuestionDao questionDao;
    public List<ProgrammingQuestions> getAllQuestions(){
        return questionDao.findAll();
    }
    public List<ProgrammingQuestions> getQuestionByCategory(String category){
        return questionDao.findByCategory(category);
    }
    public List<ProgrammingQuestions> getByDifficultyLevel(String level){
        return questionDao.findByDifficultyLevel(level);
    }

    public String addQuestion(ProgrammingQuestions question){
        questionDao.save(question);
        return "success";
    }

    public Optional<ProgrammingQuestions> getById(Integer id) {
        return questionDao.findById(id);
    }
}

