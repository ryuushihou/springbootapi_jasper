package com.doumichi.pdfServer.controller;

import com.alibaba.fastjson.JSON;
import com.doumichi.pdfServer.entity.Tuser;
import com.doumichi.pdfServer.service.InfoService;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class apiController {

    private final InfoService infoService;

    public apiController(InfoService infoService){
        this.infoService = infoService;
    }

    @ResponseBody
    @RequestMapping("getUserList")
    private String getUserList() throws Exception{
        List<Tuser> tuserList = infoService.getUserList();

        String userId = tuserList.get(0).getUser();
        String password = tuserList.get(0).getPassword();

        return userId + password + "ok";

        // jasperreport pdf出力
//        String userId = tuserList.get(0).getUser();
//        String password = tuserList.get(0).getPassword();
//
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("userId",userId);
//        param.put("password",password);
//        InputStream inputStream = apiController.class.getClassLoader().getResourceAsStream("DuomichiUserReport.jasper");
//        JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream,param,new JREmptyDataSource());
//        JasperExportManager
//                .exportReportToPdfFile(jasperPrint,"/Users/liuzhipeng/DuomichiUserReport.pdf");
//        return JSON.toJSONString(tuserList);
    }
}
