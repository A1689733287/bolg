package com.gpg.ssm.blog.service;

public interface BaseService<T> {
    public T queryById(Integer id);

    public int update(T entity);

    public int deleteById(Integer id);

    public int insert(T entity);
}
