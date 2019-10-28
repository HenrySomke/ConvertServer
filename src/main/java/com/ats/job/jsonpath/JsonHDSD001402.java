package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001402 extends BaseJsonPath{

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
        map.put("DE08_10_026_00_HZKSMC", "$.messageText.consultateDept");
        map.put("DE06_00_343_00", "$.messageText.consultateDate");
        map.put("DE02_01_039_00_HZSQYS", "$.messageText.consultatePhysician");
        map.put("DE06_00_018_00", "$.messageText.consultateView");
        map.put("DE06_00_297_00", "$.messageText.treatmentProcess");
        map.put("DE02_01_039_00", "$.messageText.patientName");

        map.put("DE06_00_296_00", "$.messageText.describe");//诊疗过程描述
        map.put("DE06_00_039_00", "$.messageText.consultationReasons");//会诊原因
        map.put("DE06_00_319_00", "$.messageText.typeOfConsultation");//会诊类型
        map.put("DE06_00_214_00", "$.messageText.purposeOfConsultation");//会诊目的
        map.put("DE06_00_182_00", "$.messageText.medicalSummary");//病历摘要

        map.put("DE02_01_039_00_HZYS", "$.messageText.consultant");//会诊医师
        map.put("DE08_10_026_00_HZSQKS", "$.messageText.consultationepartment");//会诊科室


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
        map.put("msg_emr_huanyebz", "$.messageText.emrRecord.huanyebz");
        map.put("msg_emr_isSubmit", "$.messageText.emrRecord.isSubmit");
        map.put("msg_emr_syncStatus", "$.messageText.emrRecord.syncStatus");
        map.put("msg_emr_syncTime", "$.messageText.emrRecord.syncTime");

        //新增字段
        map.put("pid", "$.pid");

        return map;
    }

    @Override
    public String getJsonPath() {
        return "./json/会诊记录json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_14_02";
    }
}