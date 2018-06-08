package com.gpg.ssm.blog.dao;

import com.gpg.ssm.blog.entity.Comment;
import com.gpg.ssm.blog.vo.ArticleCommentVo;

import java.util.List;

public interface CommentMapper extends BaseMapper<Comment> {
    public List<ArticleCommentVo> selectByArticleId(Integer articleId);
}
