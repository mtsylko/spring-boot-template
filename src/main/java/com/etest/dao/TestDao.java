package com.etest.dao;

import com.etest.entity.test.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestDao extends MongoRepository<Test, Long> {}
