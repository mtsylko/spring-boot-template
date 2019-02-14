package com.etest.service;

import com.etest.entity.test.Test;
import com.etest.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Max on 16.06.18.
 */
@Service
public class TestService extends BasicService<String, Test> {

    private TestRepository testRepository;

    @Autowired
    public void setTestRepository(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @Override
    protected MongoRepository<Test, String> getRepository() {
        return testRepository;
    }
}
