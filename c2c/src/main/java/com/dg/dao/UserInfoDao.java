package com.dg.dao;


import com.dg.pojo.Userinformation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserInfoDao {
    //注册
    int insertUser1(Userinformation uft);
    int insertUser2(@RequestParam String password);
    //登录
    Userinformation selectOnly(String phone,String password);
    //完善用户基本信息
    int updateUser(Userinformation ufi);
}
