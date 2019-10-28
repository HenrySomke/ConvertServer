package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001601 extends BaseJsonPath{

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
        map.put("DE04_01_117_00", "$.messageText.dischargeSymptoms");
        map.put("DE06_00_287_00", "$.messageText.dischargeOrder");
        map.put("DE02_01_039_00_ZYYS", "$.messageText.recorder");
        map.put("DE06_00_017_00", "$.messageText.patientInfo.dischargeTime");
        map.put("DE06_00_310_00", "$.messageText.admissionDays");
        map.put("DE05_10_148_00", "$.messageText.dischargeSituation");
        map.put("DE05_10_130_00_RYZDBM", "$.messageText.admissionDiag");
        map.put("DE05_10_130_00_CYZDBM", "$.messageText.dischargeDiag");
        map.put("DE06_00_092_00", "$.messageText.patientInfo.admissionTime");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
        map.put("DE02_01_052_00", "$.messageText.patientInfo.occupation");
        map.put("DE02_01_026_00", "$.messageText.patientInfo.age");
        map.put("DE02_01_009_01", "$.messageText.patientInfo.address");
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");
        map.put("DE02_01_018_00", "$.messageText.patientInfo.maritalStatus");





        //新增字段
        map.put("msg_pet_nativePlace", "$.messageText.patientInfo.nativePlace");
        map.put("msg_pet_nation", "$.messageText.patientInfo.nation");
        map.put("msg_pet_homePlace", "$.messageText.patientInfo.homePlace");
        map.put("msg_pet_recordingTime", "$.messageText.patientInfo.recordingTime");
        map.put("msg_pet_medicalHistoryProvider", "$.messageText.patientInfo.medicalHistoryProvider");
        map.put("msg_pet_telephone", "$.messageText.patientInfo.telephone");

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
        return "./json/出院小结json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_16_01";
    }
}