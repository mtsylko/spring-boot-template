package com.etest.controller;

import com.etest.service.BasicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public abstract class BasicController<ID, T> {

    protected abstract BasicService<ID, T> getService();

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<T> get(ID id) {
        Optional<T> optionalT = getService().get(id);
        if(optionalT.isPresent()) {
            return new ResponseEntity<>(optionalT.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<T>> getList() {
        List<T> listT = getService().getList();
        if(listT != null) {
            return new ResponseEntity<>(listT, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(method = RequestMethod.POST)
    public HttpStatus save(@RequestBody T entity) {
        T savedEntity = getService().save(entity);
        if(savedEntity != null) {
            return HttpStatus.OK;
        }
        return HttpStatus.INTERNAL_SERVER_ERROR;

    }

    @RequestMapping(method = RequestMethod.PUT)
    public HttpStatus update(@RequestBody T entity) {
        return save(entity);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public HttpStatus remove(ID id) {
        getService().remove(id);
        return HttpStatus.OK;
    }



}
