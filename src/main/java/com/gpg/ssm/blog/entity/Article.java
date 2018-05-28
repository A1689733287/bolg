package com.gpg.ssm.blog.entity;

import java.util.Date;

/**
 * 文章列表
 */
public class Article {
    private Integer id;// 文章id
    private String articleTitle;//文章标题
    private String articleContent;//文章内容
    private String summary;// 简要
    private Date writeDate;//编写时间
    private Date pubDate;//发布时间
    private String tags;// 标签
    private Integer state;// 状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", summary='" + summary + '\'' +
                ", writeDate=" + writeDate +
                ", pubDate=" + pubDate +
                ", tags='" + tags + '\'' +
                ", state=" + state +
                '}';
    }
}
