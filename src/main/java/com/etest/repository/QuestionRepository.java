package com.etest.repository;

import com.etest.entity.test.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {}
