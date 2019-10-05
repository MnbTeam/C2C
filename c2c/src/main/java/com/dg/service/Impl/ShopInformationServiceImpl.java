package com.dg.service.Impl;

import com.dg.dao.ShopInformationMapper;
import com.dg.pojo.ShopInformation;
import com.dg.service.ShopInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopInformationServiceImpl implements ShopInformationService {
  @Autowired
   private ShopInformationMapper shop;
    @Override
    public List<ShopInformation> selectTop() {
        return shop.selectTop();
    }

    @Override
    public List<ShopInformation> selectNew() {
        return shop.selectNew();
    }

    @Override
    public ShopInformation selectNewOne() {
        return shop.selectNewOne();
    }
}
