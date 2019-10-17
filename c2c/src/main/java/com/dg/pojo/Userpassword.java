package com.dg.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Userpassword implements Serializable {
    private int id;
    private Date modified;
    private String password;
    private int uid;
}
