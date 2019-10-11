package com.dg.controller;

import com.alibaba.fastjson.JSON;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Phone_email {

    ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com", "102835", " b26186b6-c6b9-40ea-b02e-e301b505f7d3");
    @RequestMapping("page/sendCode.do")
    @ResponseBody
    public String insert(String phone) throws Exception {
        int num=(int)((Math.random()*9+1)*100000);
        //String date = client.send(phone, "dg提醒您：您的验证码为"+num+");
        String results= "{\"code\":0,\"random\":"+num+"}";
        System.out.println(results);
        return JSON.toJSONString(results);
    }

    @ResponseBody
    @RequestMapping("page/checkCode.do")
    public int insertTwo(String name,String phone,String code,String token){
        //System.out.println(name+phone+code+token);
        int results=0;
        if(!code.equals(token)){
            results=1;
        }
        return results;
    }
}
