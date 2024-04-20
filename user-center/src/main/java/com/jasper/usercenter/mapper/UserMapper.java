package com.jasper.usercenter.mapper;

import com.jasper.usercenter.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
* @author jmjin
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-04-18 21:50:59
* @Entity com.jasper.usercenter.model.User
*/
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}




