package com.etest.service;

import com.etest.dao.QuestionDao;
import com.etest.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Max on 30.04.18.
 */
@Service
public class QuestionService {

    private QuestionDao questionDao;

    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public Question getQuestion(Long id) {
        Optional<Question> questionOptional = questionDao.findById(id);
        if(questionOptional.isPresent()) {
            Question question = questionOptional.get();
            return question;
        }
        return null;
    }

    public void addQuestion(Question question) {
       questionDao.save(question);
    }


    public void removeQuestion(Long id) {
        questionDao.deleteById(id);
    }


    public void editQuestion() {

    }


}
