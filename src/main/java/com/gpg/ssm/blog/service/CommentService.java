package com.gpg.ssm.blog.service;

import com.gpg.ssm.blog.entity.Comment;
import com.gpg.ssm.blog.entity.Guest;
import com.gpg.ssm.blog.vo.ArticleCommentVo;

import java.util.List;

public interface CommentService extends BaseService<Comment> {
    public Integer addComment(Guest guest, Comment comment);

    public List<ArticleCommentVo> selectByArticleId(Integer articleId);
}
