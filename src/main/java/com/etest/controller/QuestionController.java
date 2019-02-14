package com.etest.controller;

import com.etest.entity.test.Question;
import com.etest.service.BasicService;
import com.etest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/question")
public class QuestionController extends BasicController<String, Question> {

    private QuestionService questionService;

    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    protected BasicService<String, Question> getService() {
        return questionService;
    }
}
