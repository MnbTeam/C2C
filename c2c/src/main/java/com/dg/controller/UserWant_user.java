package com.dg.controller;

import com.dg.pojo.ShopInformation;
import com.dg.pojo.UserWant;
import com.dg.pojo.Userinformation;
import com.dg.service.Impl.UserWantServiceImpl;
import com.dg.tool.QiNiutool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
public class UserWant_user {

    @Autowired
    private UserWantServiceImpl uwsi;
    /**
     * 发布求购商品
     */
    @RequestMapping("page/publishUserWant.do")
    public String insertGoods(UserWant uw,HttpSession session){
        Userinformation ufi=(Userinformation)session.getAttribute("userInformation");
        uw.setUid(ufi.getId());
        int results=uwsi.insertUserWant(uw);
        return "forward:/index.html";
    }
}
