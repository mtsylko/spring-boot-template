package com.etest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TranslationDirection  extends CrudRepository<TranslationDirection, Long> {}
