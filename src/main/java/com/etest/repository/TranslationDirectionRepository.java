package com.etest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TranslationDirectionRepository extends MongoRepository<TranslationDirectionRepository, String> {}
