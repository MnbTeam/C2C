package com.dg.dao;

import com.dg.pojo.ShopInformation;

import java.util.List;

public interface ShopInformationMapper {
List<ShopInformation> selectTop();
List<ShopInformation> selectNew();
ShopInformation selectNewOne();
}
