package com.etest.dao;

import com.etest.entity.vocabulary.Dictionary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DictionaryDao extends MongoRepository<Dictionary, Long> {}
