package com.etest.service;

import com.etest.repository.UserRepository;
import com.etest.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Max on 16.06.18.
 */
@Service
public class UserService extends BasicService<String, User> {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    protected MongoRepository<User, String> getRepository() {
        return userRepository;
    }
}
