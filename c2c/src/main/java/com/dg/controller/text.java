package com.dg.controller;

import com.dg.pojo.ShopInformation;
import com.dg.pojo.Userinformation;
import com.dg.service.ShopInformationService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class text {
    @Autowired
    private ShopInformationService shops;
    @ RequestMapping("index.html")
    public void show1(HttpSession session,Model mod){
        UserShow(session);
        mod.addAttribute("selectTop",shops.selectTop());
        mod.addAttribute("selectNew",shops.selectNew());
        mod.addAttribute("selectNewOne",shops.selectNewOne());
        //mod.addAttribute("userInformation",ufi);
    }
    @RequestMapping("/page/mall_page.html")
    public void show2(HttpSession session){
        UserShow(session);
        //mod.addAttribute("texts","123456789");
        //System.out.println(2);
    }
    @RequestMapping("/page/require_mall.html")
    public void show4(HttpSession session){
        UserShow(session);
        //mod.addAttribute("texts","123456789");
       //System.out.println(1);
    }
    //发布商品
    @RequestMapping("/page/publish_product.html")
    public void show5(HttpSession session,Model mod){
        UserShow(session);
        mod.addAttribute("shopInformation",new ShopInformation());
    }
    //重复代码（获取用户）
    private void UserShow(HttpSession session){
        Userinformation ufi=(Userinformation) session.getAttribute("userInformation");
        System.out.println(ufi);
        if(ufi==null){
            ufi=new Userinformation();
            session.setAttribute("userInformation",ufi);
        }
    }

}
