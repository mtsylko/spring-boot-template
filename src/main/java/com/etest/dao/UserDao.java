package com.etest.dao;

import com.etest.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends MongoRepository<User, Long> {}
