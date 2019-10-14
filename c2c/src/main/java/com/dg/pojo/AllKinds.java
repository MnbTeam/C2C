package com.dg.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AllKinds implements Serializable {
    private Integer id;

    private String name;

    private Date modified;

    private List<Classification> cf;//二级分类

    public List<Classification> getCf() {
        return cf;
    }

    public void setCf(List<Classification> cf) {
        this.cf = cf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getModified() {
        return (Date) modified.clone();
    }

    public void setModified(Date modified) {
        this.modified = (Date) modified.clone();
    }
}