package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.dao.ArticleMapper;
import com.gpg.ssm.blog.entity.Article;
import com.gpg.ssm.blog.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "articleServiceImpl")
public class ArticleServiceImpl extends BaseServiceImpl<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> queryBytypeId(Integer typeId) {
        return articleMapper.queryBytypeId(typeId);
    }
}
