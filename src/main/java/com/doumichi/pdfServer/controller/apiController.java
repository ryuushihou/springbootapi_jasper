package com.doumichi.pdfServer.controller;

import com.alibaba.fastjson.JSON;
import com.doumichi.pdfServer.entity.Tuser;
import com.doumichi.pdfServer.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class apiController {

    @Autowired
    private InfoService infoService;

    @ResponseBody
    @RequestMapping("getUserList")
    private String getUserList(){
        List<Tuser> tuserList = infoService.getUserList();
        return JSON.toJSONString(tuserList);
    }
}
