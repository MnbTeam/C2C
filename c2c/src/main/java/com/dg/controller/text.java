package com.dg.controller;

import com.dg.service.ShopInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class text {
    @Autowired
    private ShopInformationService shops;
    @ RequestMapping("index.html")
    public void show1(Model mod){
        mod.addAttribute("selectTop",shops.selectTop());
        mod.addAttribute("selectNew",shops.selectNew());
        mod.addAttribute("selectNewOne",shops.selectNewOne());
    }
    @RequestMapping("page/mall_page.html")
    public void show2(Model mod){
        //mod.addAttribute("texts","123456789");
        //System.out.println(2);
    }
    @RequestMapping("page/require_mall.html")
    public void show4(Model mod){
        //mod.addAttribute("texts","123456789");
       //System.out.println(1);
    }

}
