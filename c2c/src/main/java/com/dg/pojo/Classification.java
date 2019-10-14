package com.dg.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Classification implements Serializable {
    private Integer cid;

    private String cname;
    private Date cmodified;

    private Integer aid;
    private List<Specific> sf;//三级分类

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Date getCmodified() {
        return cmodified;
    }

    public void setCmodified(Date cmodified) {
        this.cmodified = cmodified;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public List<Specific> getSf() {
        return sf;
    }

    public void setSf(List<Specific> sf) {
        this.sf = sf;
    }
}