package com.dg.service.Impl;

import com.dg.dao.ShopInformationMapper;
import com.dg.pojo.ShopInformation;
import com.dg.service.ShopInformationService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    @Override
    public ShopInformation selectdetails(int id) {
        return shop.selectdetails(id);
    }

    @Override
    public Page<ShopInformation> selectLike(String name,int i) {

        PageHelper.startPage(i,12);
        Page<ShopInformation> page= ( Page<ShopInformation>)shop.selectLike(name);
        return page;
    }

    @Override
    public Page<ShopInformation> selectAll(int i) {
        PageHelper.startPage(i,12);
        Page<ShopInformation> page= ( Page<ShopInformation>)shop.selectAll();
        return page;
    }
}
