package com.etest.login;

import com.etest.entity.user.User;
import com.etest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Max on 15.07.18.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({RegisterUnitTest.class})
public class RegisterUnitTest {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void register(){
        User user = new User();
        user.setId(1l);
        user.setFirstname("Maxim");
        user.setSurname("Tsylko");
        user.setEmail("mtsylko@gmail.com");
        user.setPassword("test");
        userService.createUser(user);
    }

}
