package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.dao.CommentMapper;
import com.gpg.ssm.blog.dao.GuestMapper;
import com.gpg.ssm.blog.entity.Comment;
import com.gpg.ssm.blog.entity.Guest;
import com.gpg.ssm.blog.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "commentServiceImpl")
public class CommentServiceImpl extends BaseServiceImpl<Comment> implements CommentService {
    @Resource
    private GuestMapper guestMapper;
    @Resource
    private CommentMapper commentMapper;

    @Override
    @Transactional
    public Integer addComment(Guest guest, Comment comment) {
        int insert = guestMapper.insert(guest);
        comment.setGuestId(insert);
        int i = commentMapper.insert(comment);
        return i;
    }

    @Override
    public List<Comment> selectByArticleId(Integer articleId) {
        return commentMapper.selectByArticleId(articleId);
    }
}
