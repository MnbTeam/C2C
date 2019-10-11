package com.dg.service.Impl;


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
    }
}
