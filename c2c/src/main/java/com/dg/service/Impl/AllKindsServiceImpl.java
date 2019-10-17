package com.dg.service.Impl;

import com.dg.dao.AllKindsMapper;
import com.dg.pojo.AllKinds;
import com.dg.service.AllKindsService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wsk1103 on 2017/5/13.
 */
@Service
public class AllKindsServiceImpl implements AllKindsService {

    @Resource
    private AllKindsMapper akm;
    //@Cacheable(value = "c2c",key = "#root.method.name",unless = "#result==null")
    @Override
    public List<AllKinds> selectFrist() {
        return akm.selectFrist();
    }
}


