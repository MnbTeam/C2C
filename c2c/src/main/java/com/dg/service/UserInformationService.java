package com.dg.service;

<<<<<<< HEAD
import com.dg.pojo.ShopContext;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.UserInformation;

import java.util.List;

public interface UserInformationService {
    public UserInformation SelectUser();
    public int InsertContext(ShopContext shop);
    public List<ShopContext> selectContext(ShopInformation in);
=======
import com.dg.pojo.Userinformation;

import java.util.List;

/**
 * Created by wsk1103 on 2017/4/26.
 */
public interface UserInformationService {
    int insertUser(Userinformation ufi, String password);
    Userinformation selectOnly(String phone,String password);
    int updateUser(Userinformation ufi);
>>>>>>> origin/master
}
