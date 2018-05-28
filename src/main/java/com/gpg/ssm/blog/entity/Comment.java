package com.gpg.ssm.blog.entity;

/**
 * 文章留言
 */
public class Comment {
    private Integer id;// 评论id
    private Integer articleId;//文章id
    private Integer commType;//评论类型 0 为评论 ，1 为回复的回复
    private String content;// 评内容
    private Integer guestId;// 评论用户id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCommType() {
        return commType;
    }

    public void setCommType(Integer commType) {
        this.commType = commType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", commType=" + commType +
                ", content='" + content + '\'' +
                ", guestId=" + guestId +
                '}';
    }
}
