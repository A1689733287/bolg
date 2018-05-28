package com.gpg.ssm.blog.entity;

public class TypeCate {
    private Integer id;//文章id
    private String typeName;//文章类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "TypeCate{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
