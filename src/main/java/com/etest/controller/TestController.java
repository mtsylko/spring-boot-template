package com.etest.controller;

import com.etest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Max on 30.04.18.
 */
@RestController
@RequestMapping("/test")
public class TestController extends BasicController {

    private TestService testService;

    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public void generateTest(@RequestParam("numOfQues") Integer numberOfQuestions) {

    }

    @RequestMapping(value = "/predefined", method = RequestMethod.GET)
    public void getPredefinedTest(@RequestParam("testId") Long testId) {

    }


}
