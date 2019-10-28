package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001405 extends BaseJsonPath{

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
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
        map.put("DE02_01_026_00", "$.messageText.patientInfo.age");
        map.put("DE06_00_184_00", "$.messageText.currentSituation");

        map.put("DE09_00_053_00_ZCRQ", "$.messageText.turnOutTime");//转出时间
        map.put("DE09_00_053_00_ZRRQ", "$.messageText.turnInTime");//转入时间
        map.put("DE02_01_039_00_ZCYS", "$.messageText.turnOutPerson");//转出人
        map.put("DE02_01_039_00_ZRYS", "$.messageText.turnInPerson");//转入人
        map.put("DE04_01_119_00", "$.messageText.complaint");//主诉
        map.put("DE05_10_148_00", "$.messageText.recorder");//入院情况
        map.put("DE05_01_024_00_MQZD", "$.messageText.currentDiagnosis");//目前诊断
        map.put("DE02_10_028_00", "$.messageText.observationResults");//中医“四诊”观察结果
        map.put("DE06_00_298_00", "$.messageText.assessmentAndPlan");//转入诊疗计划
        map.put("DE09_00_119_00", "$.messageText.mattersNeedingSttention");//注意事项
        map.put("DE06_00_314_00", "$.messageText.transferToTecord");//转入记录
        map.put("DE06_00_314_00_NAME", "$.messageText.transferToTecordName");//转入记录类型名称
        map.put("DE08_10_026_00_ZCKS", "$.messageText.transferOutOfDepartment");//转出科室
        map.put("DE08_10_026_00_ZRKS", "$.messageText.transferInOfDepartment");//转出科室
        map.put("DE06_00_315_00", "$.messageText.transferObjective");//转科目的
        map.put("DE06_00_287_00", "$.messageText.doctorAdvice");//中医遗嘱
        map.put("DE06_00_296_00", "$.messageText.diagnosisTreatmentProcess");//诊疗过程描述

        //时间字段
        map.put("DE06_00_316_00", "$.messageText.emrRecord.recTime");
        map.put("DE06_00_313_00", "$.messageText.emrRecord.recTime");
        map.put("DE06_00_092_00", "$.messageText.emrRecord.recTime");

        //新增字段
        map.put("pid", "$.pid");
       //多余字段
//
//        map.put("DE05_10_148_00", "$.messageText.auditor");
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
        return "./json/转科记录json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_14_05";
    }
}