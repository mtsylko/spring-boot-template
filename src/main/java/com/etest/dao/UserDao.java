package com.etest.dao;

import com.etest.entity.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Max on 01.05.18.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {}
