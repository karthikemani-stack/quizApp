package com.telusko.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="questions")
public class QuestionWrapper {

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

    public QuestionWrapper(Integer questionId, String question, String option1, String option2) {
        this.QuestionId = questionId;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
    }
}
