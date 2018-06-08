package com.gpg.ssm.blog.dao;

import com.gpg.ssm.blog.entity.User;
import com.gpg.ssm.blog.vo.UserVo;

public interface UserMapper extends BaseMapper<User> {
    public User queryByUserNmaeAndPwd(UserVo user);
}
