package com.jasper.usercenter.service;
import java.util.Date;

import com.jasper.usercenter.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = User.builder().build();
        user.setId(55200417L);
        user.setUsername("JasperJin");
        user.setAvatarUrl("");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("");
        user.setEmail("");
        user.setUserStatus(0);
        user.setUserAccount("");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setIsDelete(0);




        userService.save(user);
    }

}