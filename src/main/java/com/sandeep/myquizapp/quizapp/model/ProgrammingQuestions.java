package com.sandeep.myquizapp.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
public class ProgrammingQuestions {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String questionTitle;

private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String category;
    private String difficultyLevel;


}
