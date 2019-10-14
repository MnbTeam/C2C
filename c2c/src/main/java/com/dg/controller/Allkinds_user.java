package com.dg.controller;

import com.dg.pojo.AllKinds;
import com.dg.service.Impl.AllKindsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.List;

@Controller
public class Allkinds_user {
    @Autowired
    private AllKindsServiceImpl asi;

    @RequestMapping("page/getAllKinds.do")
    @ResponseBody
    public List<AllKinds> getAllkinds(){
        System.out.println("111");
        return  asi.selectFrist();
    }
}
