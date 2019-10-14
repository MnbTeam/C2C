package com.dg.service.Impl;

import com.dg.dao.UserWantMapper;
import com.dg.pojo.UserWant;
import com.dg.service.UserWantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wsk1103 on 2017/5/13.
 */
@Service
public class UserWantServiceImpl implements UserWantService {
    @Resource
    private UserWantMapper uwm;

    @Override
    public int insertUserWant(UserWant uw) {
        return uwm.insertUserWant(uw);
    }
}
