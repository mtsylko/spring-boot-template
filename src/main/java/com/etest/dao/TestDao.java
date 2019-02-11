package com.etest.dao;

import com.etest.entity.test.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestDao extends CrudRepository<Test, Long> {}
