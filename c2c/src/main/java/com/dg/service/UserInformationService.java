package com.dg.service;

import com.dg.pojo.Userinformation;

import java.util.List;

/**
 * Created by wsk1103 on 2017/4/26.
 */
public interface UserInformationService {
    int insertUser(Userinformation ufi, String password);
    Userinformation selectOnly(String phone,String password);
    int updateUser(Userinformation ufi);
}
