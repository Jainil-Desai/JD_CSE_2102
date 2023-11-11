package com.example.demo;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private List<Question> questions;

    public QuestionBank() {
        this.questions = new ArrayList<>();

        Question question1 = new Question(UUID.randomUUID(), "Does 2 + 2 = 4?", true);
        Question question2 = new Question(UUID.randomUUID(), "Does 5 * 5 = 10?", false);
        Question question3 = new Question(UUID.randomUUID(), "Is the capital of France Paris?", true);
        
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}