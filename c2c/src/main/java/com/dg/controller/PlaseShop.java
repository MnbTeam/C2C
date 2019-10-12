package com.dg.controller;

import com.dg.service.PlaseShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlaseShop {
    @Autowired
    private PlaseShopService ps;
    @RequestMapping("SelectPlase")
    public String PlaseShop(Model mo,@RequestParam(value = "i",defaultValue ="1") int i)
    {
        mo.addAttribute("SelectPlase",ps.SelectPlase(i));
        List<Integer> li=new ArrayList<>();
        for (int k=1;k<=ps.SelectPlase(i).getPages();k++) {
            li.add(k);
        }
        mo.addAttribute("list",li);
        return "page/require_mall.html";
    }
}
