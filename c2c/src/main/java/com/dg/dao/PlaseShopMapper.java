package com.dg.dao;

import com.dg.pojo.UserWant;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface PlaseShopMapper {
    //求购商城信息
    public List<UserWant> SelectPlase();
    //用户发布的求购商品
    public List<UserWant> SelectUid(int id);
    //删除求购商品
    int deletePlase(int id);
    //查询要修改求购信息
    UserWant SelectUidWant(int id);
    //模糊查询求购
    List<UserWant> WantLike(String name,String remark);
    //模糊查询用户求购
    List<UserWant> UserWantLike(String name,int uid);
}
