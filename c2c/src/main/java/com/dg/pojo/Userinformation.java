package com.dg.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Userinformation implements Serializable {
    private Integer id;
    private Date modified;
    private String username;
    private String phone;
    private String realname;
    private String clazz;
    private String sno;
    private String dormitory;
    private String gender;
    private Date createtime;
    private String avatar;
    private Userpassword upassword;

}
