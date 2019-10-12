package com.dg.service;

import com.dg.pojo.UserWant;
import com.github.pagehelper.Page;

import java.util.List;

public interface PlaseShopService {
    public Page<UserWant> SelectPlase(int i);
}
