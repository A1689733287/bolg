package com.gpg.ssm.blog.service;

import com.gpg.ssm.blog.dao.BaseMapper;
import com.gpg.ssm.blog.entity.Article;

import java.util.List;

public interface ArticleService extends BaseService<Article> {
    public List<Article> queryBytypeId(Integer typeId);
}
