package com.dg.service.Impl;

<<<<<<< HEAD
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
=======

import com.dg.dao.UserInfoDao;
import com.dg.pojo.Userinformation;
import com.dg.service.UserInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wsk1103 on 2017/4/26.
 */
@Service("userInformationService")
public class UserInformationServiceImpl implements UserInformationService {

    @Resource
    private UserInfoDao udao;
    //开事务
    @Override
    public int insertUser(Userinformation ufi,String password) {
        udao.insertUser1(ufi);
        udao.insertUser2(password);
        return 1;
    }

    @Override
    public Userinformation selectOnly(String phone, String password) {
        return udao.selectOnly(phone,password);
    }

    @Override
    public int updateUser(Userinformation ufi) {
        return udao.updateUser(ufi);
>>>>>>> origin/master
    }
}
