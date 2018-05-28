package com.gpg.ssm.blog.entity;

public class Tag {
    private Integer id; //标签id
    private String TagName;//标签名字

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return TagName;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", TagName='" + TagName + '\'' +
                '}';
    }

    public void setTagName(String tagName) {
        TagName = tagName;
    }
}
