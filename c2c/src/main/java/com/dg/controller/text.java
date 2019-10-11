package com.dg.controller;

import com.dg.pojo.ShopContext;
import com.dg.pojo.ShopInformation;
import com.dg.service.ShopInformationService;
import com.dg.service.UserInformationService;
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
public class text {
    @Autowired
    private ShopInformationService shops;
    @Autowired
    private UserInformationService users;
    //首页轮播图和精选商品显示
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
    //首页查询商品详细
    @RequestMapping("details")
    public String details(int id,Model mo)
    {
        mo.addAttribute("selectdetails",shops.selectdetails(id));
        mo.addAttribute("Users",users.SelectUser());
        ShopInformation in=new ShopInformation();
        in.setId(id);
        mo.addAttribute("SelectContext",users.selectContext(in));
        return "page/product_info.html";
    }
    //商城查询商品详细
    @RequestMapping("selectById.do")
    public String selectById(int id,Model mo)
    {
        mo.addAttribute("selectdetails",shops.selectdetails(id));
        mo.addAttribute("Users",users.SelectUser());
        ShopInformation in=new ShopInformation();
        in.setId(id);
        mo.addAttribute("SelectContext",users.selectContext(in));
        return "page/product_info.html";
    }

    @ResponseBody
    @RequestMapping("PlayContext")
    public int PlayContext(ShopContext sh)
    {
       if(users.InsertContext(sh)>0)
       {
     return  1;
       }else
           {
               return 0;
           }

    }
@RequestMapping("findShopByName.do")
    public String findShopByName(Model mo,String name,@RequestParam(value="i",defaultValue="1",required=true) Integer i)
{
     mo.addAttribute("selectLike",shops.selectLike(name,i));
     mo.addAttribute("likeName",name);
    List<Integer> li=new ArrayList<>();
    for (int k=1;k<=shops.selectLike(name,i).getPages();k++) {
        li.add(k);
    }
    mo.addAttribute("list",li);
    return "page/mall_page.html";
}
}
