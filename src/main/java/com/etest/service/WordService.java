package com.etest.service;

import com.etest.entity.vocabulary.Word;
import com.etest.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class WordService extends BasicService<String, Word> {

    private WordRepository wordRepository;

    @Autowired
    public void setWordRepository(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }


    @Override
    protected MongoRepository<Word, String> getRepository() {
        return wordRepository;
    }
}
