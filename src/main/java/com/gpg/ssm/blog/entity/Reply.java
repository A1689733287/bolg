package com.gpg.ssm.blog.entity;

public class Reply {
    private Integer id; // 回复id
    private Integer commentId; // 回复
    private Integer replyType; // 回复的类型 回复为1 回复的回复为2
    private Integer replyId;// 回复id
    private String content;//回复内容
    private Integer guestId;//用户id
    private Integer toGuestId;// 回复用户id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
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

    public Integer getToGuestId() {
        return toGuestId;
    }

    public void setToGuestId(Integer toGuestId) {
        this.toGuestId = toGuestId;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", commentId=" + commentId +
                ", replyType=" + replyType +
                ", replyId=" + replyId +
                ", content='" + content + '\'' +
                ", guestId=" + guestId +
                ", toGuestId=" + toGuestId +
                '}';
    }
}
