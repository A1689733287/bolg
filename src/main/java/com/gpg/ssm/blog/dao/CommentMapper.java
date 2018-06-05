package com.gpg.ssm.blog.dao;

import com.gpg.ssm.blog.entity.Comment;

import java.util.List;

public interface CommentMapper extends BaseMapper<Comment> {
    public List<Comment> selectByArticleId(Integer articleId);
}
