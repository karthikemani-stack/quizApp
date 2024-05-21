package com.telusko.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name="question_id")
    private Integer QuestionId;
    @Column(name= "question")
    private String question;
    @Column(name= "option1")
    private String option1;
    @Column(name= "option2")
    private String option2;
    @Column(name= "right_option")
    private String rightOption;
    @Column(name="category")
    private String category;

}
