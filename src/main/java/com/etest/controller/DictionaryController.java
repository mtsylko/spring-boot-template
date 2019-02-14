package com.etest.controller;


import com.etest.entity.vocabulary.Dictionary;
import com.etest.service.BasicService;
import com.etest.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dictionary")
public class DictionaryController extends BasicController<String, Dictionary> {

    private DictionaryService dictionaryService;

    @Autowired
    public void setDictionaryService(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @Override
    protected BasicService<String, Dictionary> getService() {
        return dictionaryService;
    }
}
