package com.dg.service.Impl;

import com.dg.dao.PlaseShopMapper;
import com.dg.pojo.UserWant;
import com.dg.service.PlaseShopService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopPlaseServiceImpl implements PlaseShopService {
  @Autowired
    private PlaseShopMapper pl;
    @Override
    public Page<UserWant> SelectPlase(int i) {
      PageHelper.startPage(i,9);
      Page<UserWant> page= (Page<UserWant>) pl.SelectPlase();
      return page;
    }

  @Override
  public Page<UserWant> SelectUid(int id,int i) {
    PageHelper.startPage(i,9);
    Page<UserWant> page= (Page<UserWant>)pl.SelectUid(id);
    return page;
  }

  @Override
  public int deletePlase(int id) {
    return pl.deletePlase(id);
  }

    @Override
    public UserWant SelectUidWant(int id) {
        return pl.SelectUidWant(id);
    }
}
