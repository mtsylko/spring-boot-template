package com.etest.repository;

import com.etest.entity.test.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends MongoRepository<Test, String> {}
