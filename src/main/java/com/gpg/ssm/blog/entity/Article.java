package com.gpg.ssm.blog.entity;

import java.util.Date;

/**
 * 文章列表
 */
public class Article {
    private Integer id;// 文章id
    private String articleTitle;//文章标题
    private String articleContent;//文章内容
    private String articleImage; // 文章图片
    private Integer typeId;//文章大类
    private Integer cateId;//文章小类
    private String summary;// 简要
    private Date writeDate;//编写时间
    private Date pubDate;//发布时间
    private String tags;// 标签
    private Integer hits;// 点击量
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

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
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

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
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
                ", articleImage='" + articleImage + '\'' +
                ", typeId=" + typeId +
                ", cateId=" + cateId +
                ", summary='" + summary + '\'' +
                ", writeDate=" + writeDate +
                ", pubDate=" + pubDate +
                ", tags='" + tags + '\'' +
                ", hits=" + hits +
                ", state=" + state +
                '}';
    }
}
