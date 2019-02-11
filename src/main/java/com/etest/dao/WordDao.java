package com.etest.dao;

import com.etest.entity.vocabulary.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordDao extends CrudRepository<Word, Long> {}

