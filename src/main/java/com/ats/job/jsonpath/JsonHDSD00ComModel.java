package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD00ComModel extends BaseJsonPath{

    @Override
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<String,Object>();
        //必填字段
        map.put("pk", "$.pid");
        map.put("status", "0");
        map.put("HIS_ID", "$.pid");
        map.put("VISIT_FLOW_ID", "$.pid");
        map.put("VISIT_FLOW_DOMAIN", "$.pid");
        map.put("DOCUMENT_UNIQUE_ID", "$.pid");


        map.put("DE02_01_040_00", "$.messageText.patientInfo.name");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.age");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.nativePlace");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.maritalStatus");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.nation");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.occupation");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.homePlace");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.address");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.admissionTime");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.dischargeTime");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.recordingTime");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.medicalHistoryProvider");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.telephone");




        map.put("DE05_10_148_00", "$.messageText.admissionDiag");
        map.put("DE05_10_148_00", "$.messageText.admissionSituation");
        map.put("DE05_10_148_00", "$.messageText.deathTime");
        map.put("DE05_10_148_00", "$.messageText.deathReason");
        map.put("DE05_10_148_00", "$.messageText.deathDiag");
        map.put("DE05_10_148_00", "$.messageText.admissionDays");
        map.put("DE05_10_148_00", "$.messageText.recorder");
        map.put("DE05_10_148_00", "$.messageText.auditor");



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
        return map;
    }

    @Override
    public String getJsonPath() {
        return "./json/死亡记录推送json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_14_16";
    }
}