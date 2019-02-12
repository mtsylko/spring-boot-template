package com.etest.dao;

import com.etest.entity.test.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionDao extends MongoRepository<Question, Long> {}
