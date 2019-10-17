package com.dg.controller;

import com.dg.pojo.*;
import com.dg.service.Impl.AllKindsServiceImpl;
import com.dg.service.ShopInformationService;
import com.dg.service.UserInformationService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
    private UserInformationService us;
    @Autowired
    private AllKindsServiceImpl asi;
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
        List<AllKinds> listKind=asi.selectFrist();
        mod.addAttribute("listKind",listKind);
        mod.addAttribute("shopInformation",new ShopInformation());
    }
    //发布求购商品
    @RequestMapping("/page/require_product.html")
    public void show6(HttpSession session,Model mod){
        List<AllKinds> listKind=asi.selectFrist();
        mod.addAttribute("listKind",listKind);
        mod.addAttribute("SelectUidWant",new UserWant());
        UserShow(session);
    }
    //购物车
    @RequestMapping("/page/shopping_cart.html")
    public void show7(HttpSession session){
        UserShow(session);
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
   @RequestMapping("details")
    public String details(Model mo,int id)
   {
       ShopInformation sh=new ShopInformation();
       sh.setId(id);
       mo.addAttribute("SelectClass",shops.SelectClass(id));
       mo.addAttribute("SelectContext",us.selectContext(sh));
       mo.addAttribute("selectdetails",shops.selectdetails(id));
return  "page/product_info.html";
   }
   @ResponseBody
@RequestMapping("PlayContext")
    public int PlayContext(Model mo, ShopContext sh)
{
     if(us.InsertContext(sh)>0)
     {
         return 1;
     }else
         {
             return 0;
         }
}
@RequestMapping("findShopByName.do")
public String SelectLike(Model mo,@RequestParam(value="i",defaultValue="1",required=true) Integer i,String name)
{
        mo.addAttribute("selectLike", shops.selectLike(name, i));
        mo.addAttribute("likeName", name);

    List<Integer> li = new ArrayList<>();
    for (int k=1;k<=shops.selectLike(name,i).getPages();k++) {
        li.add(k);
    }
    mo.addAttribute("list",li);
    return  "page/mall_page.html";
}
@RequestMapping("findUserShopByName.do")
public String findUserShopByName(HttpSession session,Model mo,@RequestParam(value="i",defaultValue="1",required=true) Integer i,String name)
{
    Userinformation ufi=(Userinformation) session.getAttribute("userInformation");
mo.addAttribute("SelectUid",shops.selectUserProduct(ufi.getId(),name,i));
    mo.addAttribute("likeName", name);
    List<Integer> li = new ArrayList<>();
    for (int k=1;k<=shops.selectUserProduct(ufi.getId(),name,i).getPages();k++) {
        li.add(k);
    }
    mo.addAttribute("list",li);
    return "page/personal/my_publish_product_page.html";
}
@RequestMapping("selectById.do")
    public String selectById(int id,Model mo)
{
    ShopInformation sh=new ShopInformation();
    sh.setId(id);
    mo.addAttribute("SelectClass",shops.SelectClass(id));
    mo.addAttribute("SelectContext",us.selectContext(sh));
    mo.addAttribute("selectdetails",shops.selectdetails(id));
    return  "page/product_info.html";
}
}
