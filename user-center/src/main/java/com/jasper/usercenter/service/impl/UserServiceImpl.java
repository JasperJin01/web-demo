package com.jasper.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jasper.usercenter.model.User;
import com.jasper.usercenter.service.UserService;
import com.jasper.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author jmjin
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-04-18 21:50:59
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




