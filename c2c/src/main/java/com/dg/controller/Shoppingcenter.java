package com.dg.controller;

import com.dg.dao.ShopInformationMapper;
import com.dg.pojo.AllKinds;
import com.dg.pojo.ShopInformation;
import com.dg.service.Impl.AllKindsServiceImpl;
import com.dg.service.ShopInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Shoppingcenter {
    @Autowired
    private ShopInformationService sh;
    @Autowired
    private AllKindsServiceImpl asi;
    @RequestMapping("selectAll")
    public String selectAll(Model mo,@RequestParam(value="i",defaultValue="1",required=true) Integer i)
    {

        mo.addAttribute("selectLike",sh.selectAll(i));

        List<Integer> li=new ArrayList<>();
        for (int k=1;k<=sh.selectAll(i).getPages();k++) {
            li.add(k);
        }
        mo.addAttribute("list",li);
        return "page/mall_page.html";
    }
    @RequestMapping("modifiedMyPublishProduct.do")
    public String modifiedMyPublishProduct(Model mo, int id, HttpSession session)
    {
        List<AllKinds> listKind=asi.selectFrist();
        mo.addAttribute("listKind",listKind);
        mo.addAttribute("shopInformation",sh.SelectClass(id));
        return "page/publish_product.html";
    }
}
