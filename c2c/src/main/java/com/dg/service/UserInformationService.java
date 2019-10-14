package com.dg.service;
import com.dg.pojo.ShopContext;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.Userinformation;
import com.dg.pojo.Userinformation;

import java.util.List;

public interface UserInformationService {
    public Userinformation SelectUser();

    public int InsertContext(ShopContext shop);

    public List<ShopContext> selectContext(ShopInformation in);
    int insertUser(Userinformation ufi, String password);
    Userinformation selectOnly(String phone,String password);
    int updateUser(Userinformation ufi);
    Userinformation selectByid(Integer id);
}

