package com.dg.service;

import com.dg.pojo.ShopInformation;

import java.util.List;

public interface ShopInformationService {
    List<ShopInformation> selectTop();
    List<ShopInformation> selectNew();
    ShopInformation selectNewOne();
}
