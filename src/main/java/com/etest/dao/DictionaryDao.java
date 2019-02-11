package com.etest.dao;

import com.etest.entity.vocabulary.Dictionary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DictionaryDao extends CrudRepository<Dictionary, Long> {}
