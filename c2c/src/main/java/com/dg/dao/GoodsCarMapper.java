package com.dg.dao;

import com.dg.pojo.GoodsCar;

import java.util.List;

public interface GoodsCarMapper {
    int insertCar(GoodsCar gc);//加入购物车
    List<GoodsCar> selectByUid(Integer uid);//查看购物车
}