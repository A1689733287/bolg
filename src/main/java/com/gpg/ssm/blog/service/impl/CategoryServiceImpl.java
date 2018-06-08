package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.dao.CategoryMapper;
import com.gpg.ssm.blog.entity.Category;
import com.gpg.ssm.blog.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "categoryServiceImpl")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

}
