package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.entity.User;
import com.gpg.ssm.blog.service.BaseService;
import org.springframework.stereotype.Service;

@Service(value="userServiceImpl")
public class UserServiceImpl extends BaseServiceImpl<User> implements BaseService<User> {
}
