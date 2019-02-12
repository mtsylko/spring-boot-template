package com.etest.dao;

import com.etest.entity.vocabulary.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordDao extends MongoRepository<Word, Long> {}

