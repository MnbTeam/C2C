package com.dg.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ShopInformation implements Serializable {
    private Integer id;

    private Date modified;

    private String name;

    private Integer level;

    private String remark;

    private BigDecimal price;

    private Integer sort;

    private Integer display;

    private Integer quantity;

    private Integer transaction;

    private Integer uid;

    private String image;

    private Integer sales;

    private String thumbnails;
    private int count;

    private AllKinds al;

    public void setCount(int count) {
        this.count = count;
    }

    public AllKinds getAl() {
        return al;
    }

    public void setAl(AllKinds al) {
        this.al = al;
    }

    public Classification getCl() {
        return cl;
    }

    public void setCl(Classification cl) {
        this.cl = cl;
    }

    public Specific getSp() {
        return sp;
    }

    public void setSp(Specific sp) {
        this.sp = sp;
    }

    private Classification cl;
    private Specific sp;
    public Userinformation getUs() {
        return us;
    }

    public void setUs(Userinformation us) {
        this.us = us;
    }

    private Userinformation us;
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer id) {
        this.count = count;
    }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort ;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(String thumbnails) {
        this.thumbnails = thumbnails;
    }
}