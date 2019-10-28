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

public class RecBingCQueService implements MessageListener {
    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    @Autowired
    JsonHDSD001412 obj1412 ;
    @Autowired
    JsonHDSD001404 obj1404;
    @Autowired
    JsonHDSD001407 obj1407;
    @Autowired
    JsonHDSD001416 obj1416;
    @Autowired
    JsonHDSD001301 obj1301;
    @Autowired
    JsonHDSD001411  obj1411;
    @Autowired
    JsonHDSD001402 obj1402;
    @Autowired
    JsonHDSD001408 obj1408;
    @Autowired
    JsonHDSD001410 obj1410;
    @Autowired
    JsonHDSD001401 obj1401;
    @Autowired
    JsonHDSD001415 obj1415;
    @Autowired
    JsonHDSD001003 obj1003;
    @Autowired
    JsonHDSD001403 obj1403 ;
    @Autowired
    JsonHDSD001006 obj1006 ;
    @Autowired
    JsonHDSD001405 obj1405 ;
    @Autowired
    JsonHDSD000703 obj0703 ;
    @Autowired
    JsonHDSD001601 obj1601 ;
    @Autowired
    JsonHDSD001406 obj1406 ;
    @Autowired
    JsonHDSD001414 obj1414 ;
    @Autowired
    JsonHDSD001409 obj1409 ;
    @Override
    public void onMessage(Message message) {
        try {
            paseJson(message);
            log.info("解析成功");
        } catch (Exception e) {
            log.error("onMessage Receive File Failed", e);
        }
    }



    public void paseJson(Message message) throws Exception{
        String text = ((TextMessage) message).getText();
        switch(getCdaType(text)){
            case "PreoperativeDiscussion"://术前讨论
                obj1412.ParseJson(text);
                break;
            case "PreoperativeSummary"://术前小结
                obj1404.ParseJson(text);
                break;
            case "DeathCasesDiscussion"://死亡病例讨论记录
                obj1407.ParseJson(text);
                break;
            case "ConsultationRecord"://会诊记录
                obj1402.ParseJson(text);
                break;
            case "DailyProgressRecord"://日常病程记录
                obj1408.ParseJson(text);
                break;
            case "DifficultCasesDiscussion"://疑难病例讨论记录
                obj1410.ParseJson(text);
                break;
            case "FirstPostoperativeCourseRecord"://术后首次病程记录
                obj1406.ParseJson(text);
                break;
            case "FirstProgressRecord"://首次病程记录
                obj1414.ParseJson(text);
                break;
            case "PhaseSummary"://阶段小结
                obj1401.ParseJson(text);
                break;
            case "SuperiorPhysicianCheckRecord"://上级医师查房记录
                obj1415.ParseJson(text);
                break;
            case "RescueRecord"://抢救记录
                obj1403.ParseJson(text);
                break;
            case "ShiftRecord"://交接班记录
                obj1409.ParseJson(text);
                break;
            case "TransferRecord"://转科记录
                obj1405.ParseJson(text);
                break;
            case "VaginalDeliveryRecord"://阴道分娩记录
                obj0703.ParseJson(text);
                break;
            default:
                log.error("没有匹配类似");
                break;
        }

    }

    public String getCdaType(String json){
        ReadContext context = JsonPath.parse(json);
        Object obj = FileUtils.getNode(context, "cdaType");
        String node = obj==null?"":obj.toString();
        return node;
    }

}
