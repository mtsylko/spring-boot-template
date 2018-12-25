package com.etest.controller;

import com.etest.entity.Question;
import com.etest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Max on 30.04.18.
 */
@RequestMapping("/question")
public class QuestionController extends BasicController {

    private QuestionService questionService;

    @Autowired
    public void setQuestionService(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public HttpStatus getQuestionList(Long testId) {
        return HttpStatus.OK;
    }

    @RequestMapping(method = RequestMethod.GET)
    public HttpStatus getQuestion(Long id) {
        return HttpStatus.OK;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HttpStatus addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
        return HttpStatus.OK;
    }

    @RequestMapping(method = RequestMethod.POST)
    public HttpStatus editQuestion(@RequestBody Question question) {
        return null;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public HttpStatus removeQuestion(@PathVariable("id") Long id) {
        questionService.removeQuestion(id);
        return HttpStatus.OK;
    }
}
