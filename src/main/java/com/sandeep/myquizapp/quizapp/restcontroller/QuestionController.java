package com.sandeep.myquizapp.quizapp.restcontroller;

import com.sandeep.myquizapp.quizapp.model.ProgrammingQuestions;
import com.sandeep.myquizapp.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("AllQuestions")
    public List<ProgrammingQuestions> getAllQuestions( ){
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<ProgrammingQuestions> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
    @GetMapping("difficultyLevel/{difficultyLevel}")
    public List<ProgrammingQuestions> getByDifficultyLevel(@PathVariable("difficultyLevel") String level){
        return questionService.getByDifficultyLevel(level);
    }
@GetMapping("id/{id}")
public Optional<ProgrammingQuestions> getBYId(@PathVariable ("id") Integer id){
        return questionService.getById(id);
}
    @PostMapping("add")
    public String addQuestion(@RequestBody ProgrammingQuestions question) {
        return questionService.addQuestion(question);
    }
}
