package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001401 extends BaseJsonPath{

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




        //对应字段
        map.put("DE04_01_119_00", "$.messageText.complaint");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
        map.put("DE02_01_039_00_YSQM", "$.messageText.recorder");
        map.put("DE06_00_296_00", "$.messageText.treatmentProcess");
        map.put("DE06_00_092_00", "$.messageText.patientInfo.admissionTime");
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");




        map.put("DE05_10_148_00", "$.messageText.admissionSituation");//入院情况
        map.put("DE06_00_184_00", "$.messageText.currentSituation");//目前情况
        map.put("DE04_10_174_00", "$.messageText.treatmentPlan");//治疗方案
        map.put("DE06_00_287_00", "$.messageText.doctorAdvice");//医嘱

        //时间字段
        map.put("DE06_00_218_00", "$.messageText.emrRecord.recTime");
        map.put("DE09_00_053_00", "$.messageText.emrRecord.recTime");

        //新增字段

        map.put("msg_auditor", "$.messageText.auditor");

        map.put("msg_emr_count", "$.messageText.emrRecord.count");
        map.put("msg_emr_recid", "$.messageText.emrRecord.recid");
        map.put("msg_emr_pid", "$.messageText.emrRecord.pid");
        map.put("msg_emr_babyTag", "$.messageText.emrRecord.babyTag");
        map.put("msg_emr_modelType", "$.messageText.emrRecord.modelType");
        map.put("msg_emr_modelId", "$.messageText.emrRecord.modelId");
        map.put("msg_emr_modelCode", "$.messageText.emrRecord.modelCode");
        map.put("msg_emr_recName", "$.messageText.emrRecord.recName");
        map.put("msg_emr_recTime", "$.messageText.emrRecord.recTime");
        map.put("msg_emr_recorder", "$.messageText.emrRecord.recorder");
        map.put("msg_emr_abandonTag", "$.messageText.emrRecord.abandonTag");
        map.put("msg_emr_printTag", "$.messageText.emrRecord.printTag");
        map.put("msg_emr_printTime", "$.messageText.emrRecord.printTime");
        map.put("msg_emr_modifier", "$.messageText.emrRecord.modifier");
        map.put("msg_emr_modifyTime", "$.messageText.emrRecord.modifyTime");
        map.put("msg_emr_ipid", "$.messageText.emrRecord.ipid");
        map.put("msg_emr_oldRecid", "$.messageText.emrRecord.oldRecid");
        map.put("msg_emr_yuanquid", "$.messageText.emrRecord.yuanquid");
        map.put("msg_emr_isSubmit", "$.messageText.emrRecord.isSubmit");
        map.put("msg_emr_diagModifier", "$.messageText.emrRecord.diagModifier");
        map.put("msg_emr_syncStatus", "$.messageText.emrRecord.syncStatus");
        map.put("msg_emr_syncTime", "$.messageText.emrRecord.syncTime");

        //新增字段
        map.put("pid", "$.pid");

        return map;
    }

    @Override
    public String getJsonPath() {
        return "./json/阶段小结json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_14_01";
    }
}