package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001003 extends BaseJsonPath{

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
        map.put("DE01_00_014_00", "$.messageText.patientId");
        map.put("DE05_01_024_00", "$.messageText.diseaseDiagnosis");
        map.put("DE02_01_039_00_DLRQM", "$.messageText.agentSign");
        map.put("DE09_00_053_00_DLRQMRY", "$.messageText.patientSignDate");
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");
        map.put("DE01_00_026_00", "$.messageText.bedNumber");
        map.put("DE01_00_019_00", "$.messageText.sickRoomId");
        map.put("DE05_01_075_00", "$.messageText.operationAccidents");
        map.put("DE06_00_305_00", "$.messageText.therapeuticPurpose");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
        map.put("DE02_01_039_00_YSQM", "$.messageText.doctorSign");
        map.put("DE09_00_053_00_YSQMRQ", "$.messageText.doctorSignDate");
        map.put("DE02_01_026_00", "$.messageText.patientInfo.age");
        map.put("DE06_00_018_00_YLJGYJ", "$.messageText.hospitalOpinion");
        map.put("DE06_00_018_00_HZYJ", "$.messageText.patientOpinion");

        //时间字段
//        map.put("DE06_00_092_00", "$.messageText.emrRecord.recTime");
//        map.put("DE02_01_036_00", "$.messageText.emrRecord.recTime");
        //新增字段
        map.put("pid", "$.pid");
        //多余字段
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
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.deptName");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.clinicalDiagnosis");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.deathTime");
//
//        map.put("DE05_10_148_00", "$.messageText.patientSign");
//
//        map.put("msg_emr_count", "$.messageText.emrRecord.count");
//        map.put("msg_emr_recid", "$.messageText.emrRecord.recid");
//        map.put("msg_emr_pid", "$.messageText.emrRecord.pid");
//        map.put("msg_emr_babyTag", "$.messageText.emrRecord.babyTag");
//        map.put("msg_emr_modelType", "$.messageText.emrRecord.modelType");
//        map.put("msg_emr_modelId", "$.messageText.emrRecord.modelId");
//        map.put("msg_emr_modelCode", "$.messageText.emrRecord.modelCode");
//        map.put("msg_emr_recName", "$.messageText.emrRecord.recName");
//        map.put("msg_emr_recTime", "$.messageText.emrRecord.recTime");
//        map.put("msg_emr_recorder", "$.messageText.emrRecord.recorder");
//        map.put("msg_emr_abandonTag", "$.messageText.emrRecord.abandonTag");
//        map.put("msg_emr_printTag", "$.messageText.emrRecord.printTag");
//        map.put("msg_emr_printTime", "$.messageText.emrRecord.printTime");
//        map.put("msg_emr_modifier", "$.messageText.emrRecord.modifier");
//        map.put("msg_emr_modifyTime", "$.messageText.emrRecord.modifyTime");
//        map.put("msg_emr_ipid", "$.messageText.emrRecord.ipid");
//        map.put("msg_emr_oldRecid", "$.messageText.emrRecord.oldRecid");
//        map.put("msg_emr_yuanquid", "$.messageText.emrRecord.yuanquid");
//        map.put("msg_emr_isSubmit", "$.messageText.emrRecord.isSubmit");
//        map.put("msg_emr_diagModifier", "$.messageText.emrRecord.diagModifier");
//        map.put("msg_emr_syncStatus", "$.messageText.emrRecord.syncStatus");
//        map.put("msg_emr_syncTime", "$.messageText.emrRecord.syncTime");
        return map;
    }

    @Override
    public String getJsonPath() {
        return "./json/特殊检查及特殊治疗同意书json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_10_03";
    }
}