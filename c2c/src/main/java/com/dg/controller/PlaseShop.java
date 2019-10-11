package com.dg.controller;

import com.dg.service.PlaseShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlaseShop {
    @Autowired
    private PlaseShopService ps;
    @RequestMapping("SelectPlase")
    public String PlaseShop(Model mo)
    {
        mo.addAttribute("SelectPlase",ps.SelectPlase());
        return "page/require_mall.html";
    }
}
