package com.gpg.ssm.blog.dao;

import com.gpg.ssm.blog.entity.Article;

import java.util.List;

public interface ArticleMapper extends BaseMapper<Article> {
    public List<Article> queryBytypeId(Integer typeId);
}
