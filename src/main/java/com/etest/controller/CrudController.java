package com.etest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public abstract class CrudController <T, K> {

    @RequestMapping(method = RequestMethod.GET)
    public T get(K id) {
        return  null;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<T> getList() {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public HttpStatus save(@RequestBody T entity) {
        return HttpStatus.OK;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HttpStatus update(@RequestBody T entity) {
        return HttpStatus.OK;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public HttpStatus remove(K id) {
        return HttpStatus.OK;
    }



}
