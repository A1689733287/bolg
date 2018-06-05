package com.gpg.ssm.blog;

import com.gpg.ssm.blog.entity.Comment;
import com.gpg.ssm.blog.entity.Guest;

public class ArticleCommentVo {
    private String guestName;
    private Integer articleId;
    private String content;

    public Guest getGuest() {
        Guest guest = new Guest();
        guest.setGuestName(guestName);
        return guest;
    }

    public Comment getComment() {
        Comment comment = new Comment();
        comment.setArticleId(articleId);
        comment.setContent(content);
        return comment;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
