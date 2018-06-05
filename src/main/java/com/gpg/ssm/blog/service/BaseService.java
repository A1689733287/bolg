package com.gpg.ssm.blog.service;

import java.util.List;

public interface BaseService<T> {
    public List<T> list();

    public T queryById(Integer id);

    public int update(T entity);

    public int deleteById(Integer id);

    public int insert(T entity);
}
