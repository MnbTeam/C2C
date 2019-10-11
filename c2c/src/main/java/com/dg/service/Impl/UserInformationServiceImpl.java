package com.dg.service.Impl;

import com.dg.dao.UserInformationMapper;
import com.dg.pojo.ShopContext;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.UserInformation;
import com.dg.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInformationServiceImpl  implements UserInformationService {
   @Autowired
    private UserInformationMapper user;
    @Override
    public UserInformation SelectUser() {
        return user.SelectUser();
    }

    @Override
    public int InsertContext(ShopContext sh) {
        return user.Insert(sh);
    }

    @Override
    public List<ShopContext> selectContext(ShopInformation in) {
        return user.selectContext(in);
    }
}
