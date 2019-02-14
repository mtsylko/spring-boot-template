package com.etest.service;

import com.etest.repository.QuestionRepository;
import com.etest.entity.test.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;


@Service
public class QuestionService extends BasicService <String, Question> {

    private QuestionRepository questionRepository;

    @Autowired
    public void setQuestionRepository(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    protected MongoRepository<Question, String> getRepository() {
        return questionRepository;
    }
}
