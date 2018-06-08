package com.gpg.ssm.blog.vo;

import com.gpg.ssm.blog.entity.Article;

public class ArticleVo extends Article {
    private String[] tag;

    public String[] getTag() {
        return tag;
    }

    public void setTag(String[] tag) {
        this.tag = tag;
    }
}
