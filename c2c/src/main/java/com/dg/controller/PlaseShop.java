package com.dg.controller;

import com.dg.pojo.Userinformation;
import com.dg.service.PlaseShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
    //查询用户求购
    @RequestMapping("Require")
    public String Require(Model mo, @RequestParam(value = "i",defaultValue ="1") int i, HttpSession session)
    {
        Userinformation ufi=(Userinformation) session.getAttribute("userInformation");
        mo.addAttribute("Require",ps.SelectUid(ufi.getId(),i));
        List<Integer> li=new ArrayList<>();
        for (int k=1;k<=ps.SelectUid(ufi.getId(),i).getPages();k++) {
            li.add(k);
        }
        mo.addAttribute("list",li);
    return "page/personal/my_require_product_page.html";
    }
    //查询修改求购信息
    @RequestMapping("modified_require_product.do")
    public String modified_require(int id,Model mo)
    {
        mo.addAttribute("SelectUidWant",ps.SelectUidWant(id));
        return "page/require_product.html";
    }
}
