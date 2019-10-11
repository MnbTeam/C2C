package com.dg.dao;

import com.dg.pojo.ShopInformation;

import java.util.List;

public interface ShopInformationMapper {
    //查询热门
List<ShopInformation> selectTop();
//查询最新
List<ShopInformation> selectNew();
//查询轮播
ShopInformation selectNewOne();
//查询商品详细
ShopInformation selectdetails(int id);
//模糊查询
List<ShopInformation> selectLike(String name);
//商城查询
List<ShopInformation> selectAll();
}
