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
//当前用户发布的商品查询
List<ShopInformation> selectUid(int id);
//修改的商品查询
ShopInformation SelectSid(int id);
//用户删除商品
int Product(int id);
    //发布
    int insertShopping(ShopInformation shi);
    //查询商品详细信息的分类
    ShopInformation SelectClass(int id);
    //修改商品
    int UpdateService(ShopInformation id);
    //模糊查询用户商品
    List<ShopInformation> selectUserProduct(int id,String name);
}
