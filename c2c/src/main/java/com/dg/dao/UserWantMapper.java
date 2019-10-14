package com.dg.dao;

import com.dg.pojo.UserWant;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserWantMapper {
    int insertUserWant(UserWant uw);

}