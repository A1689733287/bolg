package com.gpg.ssm.blog.service;

import com.gpg.ssm.blog.entity.Article;

import java.util.List;
import java.util.Map;

public interface ArticleService extends BaseService<Article> {
    public List<Article> queryByState(Integer state);

    public Map<String, Object> queryByCode(String code);

    public List<Article> queryHis();

    public List<Article> queryNewRank();
}
