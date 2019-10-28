package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001403 extends BaseJsonPath{

    @Override
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<String,Object>();
        //必填字段
        map.put("pk", "$.recordId");
        map.put("status", "0");
        map.put("HIS_ID", "$.recordId");
        map.put("VISIT_FLOW_ID", "$.recordId");
        map.put("VISIT_FLOW_DOMAIN", "$.recordId");
        map.put("DOCUMENT_UNIQUE_ID", "$.recordId");


        //核对字段
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
        map.put("DE02_01_039_00_YSQM", "$.messageText.recorder");
        map.put("DE02_01_026_00", "$.messageText.patientInfo.age");
        map.put("DE02_01_032_00", "$.messageText.patientInfo.age");
        map.put("DE08_30_032_00", "$.messageText.rescuePersonnel");
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");
        map.put("DE06_00_231_00", "$.messageText.rescueMeasures");
        map.put("DE06_00_218_00", "$.messageText.rescueEndDate");
        map.put("DE06_00_221_00", "$.messageText.rescueStartDate");

        map.put("DE05_10_134_00", "$.messageText.conditionChange");//病情变化情况
        map.put("DE09_00_119_00", "$.messageText.mattersNeedingattention");//注意事项
        map.put("DE06_00_094_00", "$.messageText.salvageMeasures");//抢救措施

        //时间字段
        map.put("DE09_00_053_00", "$.messageText.emrRecord.recTime");

        //新增字段
        map.put("msg_rescuePersonnel", "$.messageText.rescuePersonnel");
        map.put("msg_auditor", "$.messageText.auditor");
        map.put("pid", "$.pid");
        return map;
    }

    @Override
    public String getJsonPath() {
        return "./json/抢救记录json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_14_03";
    }
}