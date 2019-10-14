package com.dg.service.Impl;

import com.dg.dao.GoodsCarMapper;
import com.dg.pojo.GoodsCar;
import com.dg.service.GoodsCarService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wsk1103 on 2017/5/13.
 */
@Service
public class GoodsCarServiceImpl implements GoodsCarService {
    @Resource
    private GoodsCarMapper gcm;

    @Override
    public int insertCar(GoodsCar gc) {
        return gcm.insertCar(gc);
    }
}
