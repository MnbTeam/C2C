package com.dg.service;

import com.dg.pojo.ShopContext;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.UserInformation;

import java.util.List;

public interface UserInformationService {
    public UserInformation SelectUser();
    public int InsertContext(ShopContext shop);
    public List<ShopContext> selectContext(ShopInformation in);
}
