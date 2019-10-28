package com.ats.job.controller;

import com.ats.job.server.CDACreateServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @auth Huangzhiyan
 * @since 2018-06-26 14:31
 */
@Controller
@RequestMapping("/")
public class CreateController {
    @Autowired
    private CDACreateServer cdaCreateServer;

    @RequestMapping(value="getTemplate" ,produces="application/json;charset=utf-8")
    @ResponseBody
    public String getTemplate(String docType) {
        return cdaCreateServer.getTemplate(docType);
    }

    @RequestMapping(value="saveTemplate" ,produces="application/json;charset=utf-8")
    @ResponseBody
    public String saveTemplate(String docType, String xml) {
        return cdaCreateServer.saveTemplate(docType, xml);
    }

    @RequestMapping(value="setcda" ,produces="application/json;charset=utf-8")
    @ResponseBody
    public void setcda(String docType, String xml) {
        cdaCreateServer.setCDA();
    }


}
