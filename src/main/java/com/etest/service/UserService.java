package com.etest.service;

import com.etest.dao.UserDao;
import com.etest.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Max on 16.06.18.
 */
@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void createUser(User user) {
        userDao.save(user);
    }

}
