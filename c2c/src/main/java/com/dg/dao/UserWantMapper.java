package com.dg.dao;

import com.dg.pojo.UserWant;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserWantMapper {
    //发布留言
    int insertUserWant(UserWant uw);
    //修改留言
    int UpdateUserWant(UserWant uw);
}