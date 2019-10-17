package com.dg.controller;


import com.alibaba.fastjson.JSON;
import com.dg.pojo.ShopInformation;
import com.dg.pojo.Userinformation;
import com.dg.service.Impl.UserInformationServiceImpl;
import com.dg.service.PlaseShopService;
import com.dg.service.ShopInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserInfoWeb {
    @Autowired
    private UserInformationServiceImpl usi;
    @Autowired
    private ShopInformationService shops;
    @Autowired
    private PlaseShopService pl;
    /**
     * 用户注册
     */
    @RequestMapping("/page/insertUser.do")
    @ResponseBody
    public int insertUser(String username,String phone ,String password){
        System.out.println(username+""+phone+""+password);
        Userinformation ufi=new Userinformation();
        ufi.setUsername(username);
        ufi.setPhone(phone);
        return usi.insertUser(ufi,password);
        //return 1;
    }
    /**
     * 登录
     */
    @RequestMapping("/page/login.do")
    public String selectOnlyPerson(String phone, String password, HttpSession session){
        System.out.println(phone+""+password);
        Userinformation uinfo=usi.selectOnly(phone,password);
        if(uinfo==null){
            uinfo=new Userinformation();
        }else{
            //把对象存起来(List)
            session.setAttribute("userInformation",uinfo);
            return "redirect:/index.html";
        }
        return "redirect:/page/login_page.html";
    }

    //查看用户基本信息
    @RequestMapping("/page/personal_info.do")
    public String personalInfo(HttpSession session,Model model) {
        Userinformation ufi=(Userinformation) session.getAttribute("userInformation");
        model.addAttribute("userInformation",ufi);
        return "page/personal/personal_info";
    }
    //完善用户基本信息，认证
    @RequestMapping("/page/certification.do")
    @ResponseBody
    public int certification(HttpSession session,String json){
        System.out.println(json);
        Map map=JSON.parseObject(json);
        Userinformation ufi=(Userinformation)session.getAttribute("userInformation");
        ufi.setUsername((String)map.get("userName"));
        ufi.setRealname((String)map.get("realName"));
        ufi.setGender((String)map.get("gender"));
        ufi.setSno((String) map.get("sno"));
        ufi.setDormitory((String)map.get("dormitory"));
        int results=usi.updateUser(ufi);
        ufi=usi.selectByid(ufi.getId());
        session.setAttribute("userInformation",ufi);
        return results;
    }
    //查询用户商品信息
    @RequestMapping("selectUidAll")
    public String selectUidAll(Model mo,@RequestParam(value="i",defaultValue="1",required=true) int i,HttpSession session)
    {
        Userinformation ufi=(Userinformation) session.getAttribute("userInformation");
        List<Integer> li=new ArrayList<>();
        int id=ufi.getId();
        mo.addAttribute("SelectUid",shops.selectUid(i,id));
       /* List<ShopInformation> list=new ArrayList<>();
        for (ShopInformation sh:shops.selectUid(i,id)) {
            list.add(shops.SelectClass(sh.getId()));
        }
        mo.addAttribute("SelectClass",list);*/
        for (int k=1;k<=shops.selectUid(i,id).getPages();k++) {
            li.add(k);
        }
        mo.addAttribute("list",li);
        return "page/personal/my_publish_product_page.html";
    }
//删除用户商品
    @ResponseBody
    @RequestMapping("deleteShop.do")
    public int deleteShop(Integer id,Model mo)
    {
        if(shops.Product(id)>0)
        {
            return 1;
        }else
            {
                return 0;
            }
    }
   //删除用户求购
    @ResponseBody
    @RequestMapping("deleteWant.do")
    public int deleteWant(int id)
    {
        if(pl.deletePlase(id)>0)
        {
            return 1;
        }else
        {
            return 0;
        }

    }
}
