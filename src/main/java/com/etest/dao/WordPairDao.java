package com.etest.dao;

import com.etest.entity.vocabulary.WordPair;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordPairDao extends MongoRepository<WordPair, Long> {}