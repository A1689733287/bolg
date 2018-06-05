package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.dao.BaseMapper;
import com.gpg.ssm.blog.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    BaseMapper<T> baseMapper;

    @Override
    public List<T> list() {
        return baseMapper.list();
    }

    @Override
    public T queryById(Integer id) {
        return baseMapper.queryById(id);
    }

    @Override
    public int update(T entity) {
        return baseMapper.update(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public int insert(T entity) {
        return baseMapper.insert(entity);
    }
}
