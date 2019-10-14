package com.dg.controller;

import com.dg.pojo.GoodsCar;
import com.dg.pojo.Userinformation;
import com.dg.service.Impl.GoodsCarServiceImpl;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ShopCar_user {
    @Autowired
    private GoodsCarServiceImpl gcsi;
    //加入购物车
    @RequestMapping("/insertGoodsCar.do")
    @ResponseBody
    public int insertGoodsCar(HttpSession session,Integer sid){
        Userinformation ufi=(Userinformation) session.getAttribute("userInformation");
        int results=0;
        Integer uid=ufi.getId();
        if(uid==null){
            results=2;
        }else{
            GoodsCar gc=new GoodsCar();
            gc.setUid(uid);
            gc.setSid(sid);
            gc.setQuantity(1);
            results=gcsi.insertCar(gc);
        }
        return  results;
    }
    //购物车开始
    //@RequestMapping("")
    public void getShopCarCounts(){

    }

    //check the shopping cart,查看购物车
    //@RequestMapping("")
    public void selectShopCar(){

    }
}
