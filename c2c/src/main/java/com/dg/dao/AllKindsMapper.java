package com.dg.dao;

import com.dg.pojo.AllKinds;

import java.util.List;

public interface AllKindsMapper {
    List<AllKinds> selectFrist();//查询一二三级分类
}