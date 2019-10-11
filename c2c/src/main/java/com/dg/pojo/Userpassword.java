package com.dg.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Userpassword {
    private int id;
    private Date modified;
    private String password;
    private int uid;
}
