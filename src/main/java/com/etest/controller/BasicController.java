package com.etest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Max on 29.04.18.
 */
@RestController
@RequestMapping("/api")
public class BasicController {


    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello1!";
    }
}
