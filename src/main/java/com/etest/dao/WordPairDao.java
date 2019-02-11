package com.etest.dao;

import com.etest.entity.vocabulary.WordPair;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WordPairDao extends CrudRepository<WordPair, Long> {}