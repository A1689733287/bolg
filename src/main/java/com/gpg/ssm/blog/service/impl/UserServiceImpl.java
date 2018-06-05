package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.dao.UserMapper;
import com.gpg.ssm.blog.entity.User;
import com.gpg.ssm.blog.service.BaseService;
import com.gpg.ssm.blog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userServiceImpl")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryByUserNmaeAndPwd(User user) {
        return userMapper.queryByUserNmaeAndPwd(user);
    }
}
