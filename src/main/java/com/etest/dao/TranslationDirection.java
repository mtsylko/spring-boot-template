package com.etest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TranslationDirection  extends MongoRepository<TranslationDirection, Long> {}
