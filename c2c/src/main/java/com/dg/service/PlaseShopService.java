package com.dg.service;

import com.dg.pojo.UserWant;
import com.github.pagehelper.Page;

import java.util.List;

public interface PlaseShopService {
    public Page<UserWant> SelectPlase(int i);
    public Page<UserWant> SelectUid(int id,int i);
    int deletePlase(int id);
    UserWant SelectUidWant(int id);
}
