package com.dg.service.Impl;

import com.dg.dao.PlaseShopMapper;
import com.dg.pojo.UserWant;
import com.dg.service.PlaseShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopPlaseServiceImpl implements PlaseShopService {
  @Autowired
    private PlaseShopMapper pl;
    @Override
    public List<UserWant> SelectPlase() {
        return pl.SelectPlase();
    }
}
