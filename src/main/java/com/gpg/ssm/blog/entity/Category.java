package com.gpg.ssm.blog.entity;

/**
 * 文章分类表
 */
public class Category {
    private Integer id; //分类id
    private String cateName; // 类别名称
    private Integer typeId;// 大类ID
    private Integer count;//文章数量

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", cateName='" + cateName + '\'' +
                ", typeId=" + typeId +
                ", count=" + count +
                '}';
    }
}
