package com.etest.dao;

import com.etest.entity.test.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionDao extends CrudRepository<Question, Long> {}
