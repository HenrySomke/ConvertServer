package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001301 extends BaseJsonPath{

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
        map.put("DE06_00_296_00", "$.messageText.treatment");
        map.put("DE02_01_052_00", "$.messageText.patientInfo.occupation");
        map.put("DE02_01_026_00", "$.messageText.patientInfo.age");
        map.put("DE02_01_032_00", "$.messageText.patientInfo.age");
        map.put("DE05_10_148_00", "$.messageText.admissionSituation");
        map.put("DE06_00_092_00", "$.messageText.patientInfo.admissionTime");
        map.put("DE05_01_025_00_RYZD", "$.messageText.admissionDiag");
        map.put("DE02_01_025_00", "$.messageText.patientInfo.nation");
        map.put("DE02_01_009_01", "$.messageText.patientInfo.nativePlace");
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");
        map.put("DE02_01_018_00", "$.messageText.patientInfo.maritalStatus");
        map.put("DE02_01_039_00_BSCSZ", "$.messageText.medicalHistoryProvider");
        map.put("DE06_00_193_00", "$.messageText.dischargeSituation");
        map.put("DE06_00_017_00", "$.messageText.patientInfo.dischargeTime");
        map.put("DE06_00_287_00", "$.messageText.dischargeOrder");
        map.put("DE05_01_025_00_CYZD", "$.messageText.dischargeDiag");
        map.put("DE02_01_039_00_ZRYS", "$.messageText.recorder");
        map.put("DE04_01_119_00", "$.messageText.complaint");
        map.put("DE04_01_118_00", "$.messageText.admissionDiag");
        map.put("DE04_01_117_00", "$.messageText.admissionSituation");




        //时间字段
        map.put("DE06_00_220_00", "$.messageText.emrRecord.recTime");
        map.put("DE06_00_092_00", "$.messageText.emrRecord.recTime");

        //新增字段
        map.put("recordId", "$.recordId");
        map.put("pid", "$.pid");
        map.put("msg_pet_homePlace", "$.messageText.patientInfo.homePlace");
        map.put("msg_pet_address", "$.messageText.patientInfo.address");
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

        return map;
    }

    @Override
    public String getJsonPath() {
        return "./json/24小时内入出院记录推送json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_13_01";
    }
}