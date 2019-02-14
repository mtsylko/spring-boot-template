package com.etest.service;

import com.etest.entity.vocabulary.WordPair;
import com.etest.repository.WordPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class WordPairService extends BasicService<String, WordPair> {

    private WordPairRepository wordPairRepository;

    @Autowired
    public void setWordPairRepository(WordPairRepository wordPairRepository) {
        this.wordPairRepository = wordPairRepository;
    }

    @Override
    protected MongoRepository<WordPair, String> getRepository() {
        return wordPairRepository;
    }
}
