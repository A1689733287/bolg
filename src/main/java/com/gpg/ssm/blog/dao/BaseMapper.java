package com.gpg.ssm.blog.dao;

import java.util.List;

public interface BaseMapper<T> {
    public List<T> list();

    public T queryById(Integer id);

    public int update(T entity);

    public int deleteById(Integer id);

    public int insert(T entity);
}
