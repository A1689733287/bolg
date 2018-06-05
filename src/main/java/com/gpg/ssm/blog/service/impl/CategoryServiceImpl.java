package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.dao.CategoryMapper;
import com.gpg.ssm.blog.dao.UserMapper;
import com.gpg.ssm.blog.entity.Category;
import com.gpg.ssm.blog.entity.User;
import com.gpg.ssm.blog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "categoryServiceImpl")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryMapper {

}
