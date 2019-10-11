package com.dg.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShopContext implements Serializable {
    private Integer id;

    private Date modified;

    private Integer sid;

    private String context;

    private Integer display;
    private int uid;

    public UserInformation getUs() {
        return us;
    }

    public void setUs(UserInformation us) {
        this.us = us;
    }

    private UserInformation us;

    /*private String username;
    public String  getUsername() {
        return username;
    }

    public void setUs(Integer id) {
        this.username= username;
    }*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getModified() {
        return modified == null ? null : (Date) modified.clone();
    }

    public void setModified(Date modified) {
        this.modified = modified == null ? null : (Date) modified.clone();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}