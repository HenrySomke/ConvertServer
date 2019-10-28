package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001415 extends BaseJsonPath{

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
        map.put("DE02_01_039_00_JLR", "$.messageText.recorder");
        map.put("DE06_00_298_00", "$.messageText.assessmentPlan");
        map.put("DE09_00_053_00", "$.messageText.recordDate");
        map.put("DE06_00_287_00", "$.messageText.dischargeOrder");
        map.put("DE05_01_025_00", "$.messageText.dischargeDiag");//诊疗计划
        map.put("DE06_00_181_00", "$.messageText.discussionRecord");//查房记录






//新增字段
        map.put("pid", "$.pid");

        //核对异常
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.name");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.age");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.nativePlace");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.maritalStatus");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.nation");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.occupation");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.homePlace");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.address");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.admissionTime");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.dischargeTime");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.recordingTime");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.medicalHistoryProvider");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.telephone");
//        map.put("DE05_10_148_00", "$.messageText.auditor");

        return map;
    }

    @Override
    public String getJsonPath() {
        return "./json/上级医师查房记录json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_14_15";
    }
}