package com.dg.pojo;

import java.io.Serializable;
import java.util.Date;

public class Specific implements Serializable {
    private Integer sid;

    private String sname;

    private Date smodified;

    private Integer cid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSmodified() {
        return smodified;
    }

    public void setSmodified(Date smodified) {
        this.smodified = smodified;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}