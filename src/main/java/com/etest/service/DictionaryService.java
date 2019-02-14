package com.etest.service;

import com.etest.entity.vocabulary.Dictionary;
import com.etest.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService extends BasicService<String, Dictionary> {

    private DictionaryRepository dictionaryRepository;

    @Autowired
    public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }

    @Override
    protected MongoRepository<Dictionary, String> getRepository() {
        return null;
    }
}
