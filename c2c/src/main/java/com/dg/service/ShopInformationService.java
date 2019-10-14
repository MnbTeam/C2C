package com.dg.service;

import com.dg.pojo.ShopInformation;
import com.github.pagehelper.Page;

import java.util.List;

public interface ShopInformationService {
    List<ShopInformation> selectTop();
    List<ShopInformation> selectNew();
    ShopInformation selectNewOne();
    ShopInformation selectdetails(int id);
    Page<ShopInformation> selectLike(String name,int i);
    Page<ShopInformation> selectAll(int i);
    Page<ShopInformation> selectUid(int i,int id);
    ShopInformation SelectSid(int id);
    int Product(int id);
    int insertShopping(ShopInformation shi);
}
