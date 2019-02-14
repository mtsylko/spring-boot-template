package com.etest.repository;

import com.etest.entity.vocabulary.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordRepository extends MongoRepository<Word, String> {}

