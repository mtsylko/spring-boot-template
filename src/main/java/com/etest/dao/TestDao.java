package com.etest.dao;

import com.etest.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Max on 16.06.18.
 */
@Repository
public interface TestDao extends CrudRepository<Test, Long> {}
