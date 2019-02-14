package com.etest.controller;

import com.etest.entity.vocabulary.Word;
import com.etest.service.BasicService;
import com.etest.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class WordController extends BasicController<String, Word> {

    private WordService wordService;

    @Autowired
    public void setWordService(WordService wordService) {
        this.wordService = wordService;
    }

    @Override
    protected BasicService<String, Word> getService() {
        return wordService;
    }

}
