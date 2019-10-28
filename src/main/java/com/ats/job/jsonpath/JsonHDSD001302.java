package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001302 extends BaseJsonPath{

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
        map.put("DE02_10_026_00", "$.messageText.previousHistory");
        map.put("DE02_10_102_00", "$.messageText.menstrualHistory");
        map.put("DE02_01_052_00", "$.messageText.patientInfo.occupation");
        map.put("DE02_01_026_00", "$.messageText.patientInfo.age");
        map.put("DE06_00_092_00", "$.messageText.patientInfo.admissionTime");
        map.put("DE02_01_025_00", "$.messageText.patientInfo.nation");
        map.put("DE02_01_009_01", "$.messageText.patientInfo.address");
        map.put("DE02_10_097_00", "$.messageText.personalHistory");
        map.put("DE05_10_172_00_CBZDBM", "$.messageText.initialDiagnosis");
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");
        map.put("DE02_01_018_00", "$.messageText.patientInfo.maritalStatus");
        map.put("DE02_10_098_00", "$.messageText.obstetricHistory");
        map.put("DE02_10_103_00", "$.messageText.familyHistory");
        map.put("DE02_01_039_00_BSCSZ", "$.messageText.patientInfo.medicalHistoryProvider");
        map.put("DE04_01_119_00", "$.messageText.complaint");
        map.put("DE02_01_039_00_ZZYS", "$.messageText.recordingPhysician");
        map.put("DE08_10_061_00", "$.messageText.specialSituation");
        map.put("DE04_10_081_00", "$.messageText.physicalExamination.breathing");
        map.put("DE04_10_118_00", "$.messageText.physicalExamination.pulse");
        map.put("DE04_10_126_00", "$.messageText.physicalExamination.skinSituation");
        map.put("DE04_10_174_00", "$.messageText.physicalExamination.systolicPressure");
        map.put("DE04_10_176_00", "$.messageText.physicalExamination.diastolicPressure");
        map.put("DE04_10_186_00", "$.messageText.physicalExamination.temperature");
        map.put("DE04_10_261_00", "$.messageText.physicalExamination.headSituation");
        map.put("DE04_10_263_00", "$.messageText.physicalExamination.tonsilSituation");
        map.put("DE04_10_219_00", "$.messageText.physicalExamination.generalSituation");
        map.put("DE02_10_071_00", "$.messageText.hpi");
        map.put("DE04_30_009_00", "$.messageText.accessoryExamination");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");


        //新增字段
        map.put("msg_pet_nativePlace", "$.messageText.patientInfo.nativePlace");
        map.put("msg_pet_homePlace", "$.messageText.patientInfo.homePlace");
        map.put("msg_pet_dischargeTime", "$.messageText.patientInfo.dischargeTime");
        map.put("msg_pet_recordingTime", "$.messageText.patientInfo.recordingTime");
        map.put("msg_pet_telephone", "$.messageText.patientInfo.telephone");

        map.put("msg_phy_text", "$.messageText.physicalExamination.text");
        map.put("msg_phy_inchargeDate", "$.messageText.physicalExamination.inchargeDate");

        map.put("msg_previousHistory", "$.messageText.previousHistory");

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
        return "./json/入院记录推送json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_13_02";
    }
}