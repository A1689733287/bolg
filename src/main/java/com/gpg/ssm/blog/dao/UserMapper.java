package com.gpg.ssm.blog.dao;

import com.gpg.ssm.blog.entity.User;

public interface UserMapper extends BaseMapper<User> {
    public User queryByUserNmaeAndPwd(User user);
}
