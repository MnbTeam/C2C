package com.dg.controller;


import com.alibaba.fastjson.JSON;
import com.dg.pojo.Userinformation;
import com.dg.service.Impl.UserInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserInfoWeb {
    @Autowired
    private UserInformationServiceImpl usi;

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
        ufi.setSno((Integer) map.get("sno"));
        ufi.setDormitory((String)map.get("dormitory"));
        System.out.println(ufi.getUsername()+"\t"+ufi.getRealname()+"\t"+ufi.getGender());
        System.out.println(ufi.getId()+"\t"+ufi.getSno()+"\t"+ufi.getDormitory());
        //return 1;
        return usi.updateUser(ufi);
    }

}
