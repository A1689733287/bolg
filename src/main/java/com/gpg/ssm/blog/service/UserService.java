package com.gpg.ssm.blog.service;


import com.gpg.ssm.blog.entity.User;
import com.gpg.ssm.blog.vo.UserVo;

public interface UserService extends BaseService<User> {
    public User queryByUserNmaeAndPwd(UserVo user);
}
