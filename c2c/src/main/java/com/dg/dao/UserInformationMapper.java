package com.dg.dao;

import com.dg.pojo.ShopContext;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.Userinformation;
import com.dg.pojo.Userinformation;

import java.util.List;

public interface UserInformationMapper {
    //测试用户
    public Userinformation SelectUser();
    //发表留言
    public int Insert(ShopContext sh);
    //查询留言
    public List<ShopContext> selectContext(ShopInformation in);
}
