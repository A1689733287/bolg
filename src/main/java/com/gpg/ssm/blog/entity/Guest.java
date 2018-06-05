package com.gpg.ssm.blog.entity;

/**
 * 游客表
 */
public class Guest {
    private Integer id; //游客id
    private String guestName;// 游客姓名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", guestName='" + guestName + '\'' +
                '}';
    }
}
