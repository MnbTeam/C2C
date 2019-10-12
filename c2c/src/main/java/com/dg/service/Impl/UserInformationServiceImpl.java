package com.dg.service.Impl;

import com.dg.dao.UserInfoDao;
import com.dg.dao.UserInformationMapper;
import com.dg.pojo.ShopContext;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.Userinformation;
import com.dg.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInformationServiceImpl  implements UserInformationService {
    @Autowired
    private UserInformationMapper user;

    @Override
    public Userinformation SelectUser() {

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
    @Resource
    private UserInfoDao udao;
    //开事务
    @Override
    public int insertUser(Userinformation ufi, String password) {
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
    }
}
