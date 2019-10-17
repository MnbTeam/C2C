package com.dg.controller;

import com.dg.pojo.ShopInformation;
import com.dg.pojo.Userinformation;
import com.dg.service.Impl.ShopInformationServiceImpl;
import com.dg.tool.QiNiutool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
public class Shopping_user {
    @Autowired
    private ShopInformationServiceImpl shi;

    /**
     * 发布和修改商品
     */
    @RequestMapping("page/insertGoods.do")
    public String insertGoods(ShopInformation sinfo, MultipartFile imageS, HttpSession session,String ss) {
        if (ss.equals("发布")) {
            Userinformation ufi = (Userinformation) session.getAttribute("userInformation");
            String fileName = QiNiutool.upload(imageS);
            sinfo.setImage(" http://pz7e7rpto.bkt.clouddn.com/" + fileName);
            sinfo.setUid(ufi.getId());
            int results = shi.insertShopping(sinfo);
            return "forward:/index.html?fb=" + results;
        }else if(ss.equals("修改"))
        {
            String fileName = QiNiutool.upload(imageS);
            sinfo.setImage(" http://pz7e7rpto.bkt.clouddn.com/" + fileName);
              if(shi.UpdateService(sinfo)>0)
              {
                  System.out.println("ssssss");
                  return "forward:/index.html";
              }
        }
        return "";
    }
}
