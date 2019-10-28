package com.ats.job.server;

import com.ats.job.jsonpath.*;
import com.ats.job.tool.FileUtils;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
 * Created by fangbangben on 2018/9/7.
 */

public class RecBingLQueService implements MessageListener {
    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    @Autowired
    JsonHDSD001302 obj1302;
    @Autowired
    JsonHDSD001416 obj1416;
    @Autowired
    JsonHDSD001301 obj1301;
    @Autowired
    JsonHDSD001411 obj1411;
    @Autowired
    JsonHDSD001412 obj1412 ;
    @Autowired
    JsonHDSD001404 obj1404;
    @Autowired
    JsonHDSD001601 obj1601;
    @Autowired
    JsonHDSD001002 obj1002;
    @Autowired
    JsonHDSD001004 obj1004;
    @Autowired
    JsonHDSD001005 obj1005;
    @Autowired
    JsonHDSD001003 obj1003;
    @Autowired
    JsonHDSD001006 obj1006;
    @Autowired
    JsonHDSD001001 obj1001;
    @Autowired
    JsonHDSD001303 obj1303;
    @Override
    public void onMessage(Message message) {
        try {
            paseJson(message);
            log.info("解析成功");
        } catch (Exception e) {
            log.error("onMessage Receive File Failed", e);
        }
    }

    public String getCdaType(String json){
        ReadContext context = JsonPath.parse(json);
        Object obj = FileUtils.getNode(context, "cdaType");
        String node = obj==null?"":obj.toString();
        return node;
    }

    public void paseJson(Message message) throws Exception{
        String text = ((TextMessage) message).getText();
        switch(getCdaType(text)){
            case "AdmissionRecord"://入院记录
                obj1302.ParseJson(text);
                break;
            case "DeathRecord"://死亡记录
                obj1416.ParseJson(text);
                break;
            case "Death24HRec"://24小时死亡记录
                obj1303.ParseJson(text);
                break;
            case "Discharge24HRecord"://24小时出入院记录
                obj1301.ParseJson(text);
                break;
            case "DischargeRecord"://出院记录
                obj1411.ParseJson(text);
                break;
            case "PreoperativeDiscussion"://术前讨论
                obj1412.ParseJson(text);
                break;
            case "PreoperativeSummary"://术前小结
                obj1404.ParseJson(text);
                break;
            case "DischargeSummary"://出院小结
                obj1601.ParseJson(text);
                break;
            case "OperationInform"://手术知情同意书
                obj1002.ParseJson(text);
                break;
            case "AnesthesiaInformed"://麻醉知情同意书
                obj1004.ParseJson(text);
                break;
            case "TransfusionTreatmentInformed"://输血治疗同意书
                obj1005.ParseJson(text);
                break;
            case "SpecialExaminationInformed"://特殊检查及特殊治疗同意书
                obj1003.ParseJson(text);
                break;
            case "DangerNoticeInformed"://病危（重）通知书
                obj1006.ParseJson(text);
                break;
            case "OtherInformed"://其他知情同意书
                obj1001.ParseJson(text);
                break;
            default:
                log.error("没有匹配类似");
                break;
        }

    }
}
