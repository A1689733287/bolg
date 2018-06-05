package com.gpg.ssm.blog.service;


import com.gpg.ssm.blog.entity.User;

public interface UserService extends BaseService<User> {
    public User queryByUserNmaeAndPwd(User user);
}
