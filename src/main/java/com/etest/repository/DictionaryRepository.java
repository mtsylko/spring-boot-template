package com.etest.repository;

import com.etest.entity.vocabulary.Dictionary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DictionaryRepository extends MongoRepository<Dictionary, String> {}
