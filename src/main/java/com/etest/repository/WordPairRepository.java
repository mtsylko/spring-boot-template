package com.etest.repository;

import com.etest.entity.vocabulary.WordPair;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordPairRepository extends MongoRepository<WordPair, String> {}