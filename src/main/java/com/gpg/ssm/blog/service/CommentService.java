package com.gpg.ssm.blog.service;

import com.gpg.ssm.blog.entity.Comment;
import com.gpg.ssm.blog.entity.Guest;

import java.util.List;

public interface CommentService extends BaseService<Comment> {
    public Integer addComment(Guest guest, Comment comment);

    public List<Comment> selectByArticleId(Integer articleId);
}
