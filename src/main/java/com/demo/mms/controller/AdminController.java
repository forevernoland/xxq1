package com.demo.mms.controller;

import com.demo.mms.common.domain.Admin;
import com.demo.mms.common.domain.Midreport;
import com.demo.mms.common.utils.IDGenerator;
import com.demo.mms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/addAdmin")
    @ResponseBody
    public Object saveAdmin(Admin admin){
        admin.setId(IDGenerator.getId());
        admin.setRemarks("测试添加的垃圾");
        adminService.addAdmin(admin);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/addMidreport")
    @ResponseBody
    public Object saveMidreport(Midreport midreport){
        adminService.addMidreport(midreport);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
