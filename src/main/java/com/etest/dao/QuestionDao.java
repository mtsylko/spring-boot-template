package com.etest.dao;

import com.etest.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Max on 30.04.18.
 */
@Repository
public interface QuestionDao extends CrudRepository<Question, Long> {}
