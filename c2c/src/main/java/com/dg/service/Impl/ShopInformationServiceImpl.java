package com.dg.service.Impl;

import com.dg.dao.ShopInformationMapper;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.UserWant;
import com.dg.service.ShopInformationService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ShopInformationServiceImpl implements ShopInformationService {
    @Resource
    private ShopInformationMapper shop;

    //@Cacheable(value = "c2c",key = "#root.method.name",unless = "#result==null")
    @Override
    public List<ShopInformation> selectTop() {
        return shop.selectTop();
    }

    //@Cacheable(value = "c2c",key = "#root.method.name",unless = "#result==null")
    @Override
    public List<ShopInformation> selectNew() {
        return shop.selectNew();
    }

    //@Cacheable(value = "c2c",key = "#root.method.name",unless = "#result==null")
    @Override
    public ShopInformation selectNewOne() {
        return shop.selectNewOne();
    }

    @Override
    public ShopInformation selectdetails(int id) {
        return shop.selectdetails(id);
    }

    @Override
    public Page<ShopInformation> selectLike(String name,int i) {

        PageHelper.startPage(i,9);
        Page<ShopInformation> page= ( Page<ShopInformation>)shop.selectLike(name);
        return page;
    }

    //@Cacheable(value = "c2c",key = "#root.method.name",unless = "#result==null")
    @Override
    public Page<ShopInformation> selectAll(int i) {
        PageHelper.startPage(i,9);
        Page<ShopInformation> page= ( Page<ShopInformation>)shop.selectAll();
        return page;
    }
    @Override
    public Page<ShopInformation> selectUid(int i,int id) {
        PageHelper.startPage(i,9);
        Page<ShopInformation> page= ( Page<ShopInformation>)shop.selectUid(id);
        return page;
    }
    @Override
    public ShopInformation SelectSid(int id) {
        return shop.SelectSid(id);
    }

    @Override
    public int Product(int id) {
        return shop.Product(id);
    }
    @Override
    public int insertShopping(ShopInformation shi) {
        return shop.insertShopping(shi);
    }

    @Override
    public ShopInformation SelectClass(int id) {
        return shop.SelectClass(id);
    }

    @Override
    public int UpdateService(ShopInformation id) {
        return shop.UpdateService(id);
    }

    @Override
    public Page<ShopInformation> selectUserProduct(int id, String name, int i) {
        PageHelper.startPage(i,9);
        Page<ShopInformation> page= (Page<ShopInformation>)shop.selectUserProduct(id,name);
        return page;
    }
}
