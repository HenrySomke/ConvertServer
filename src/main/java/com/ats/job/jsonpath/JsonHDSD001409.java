package com.ats.job.jsonpath;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class JsonHDSD001409 extends BaseJsonPath{
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
        map.put("DE01_00_014_00", "$.messageText.patiendtId");
        map.put("DE09_00_119_00", "$.messageText.mattersAttention");
        map.put("DE06_00_092_00", "$.messageText.patientInfo.admissionTime");
        map.put("DE02_01_026_00", "$.messageText.patientInfo.age");
        map.put("DE02_01_039_00_JABR", "$.messageText.handrecorder");//交班签名
        map.put("DE02_01_039_00_JEBR", "$.messageText.catchrecorder");//接班签名
        map.put("DE06_00_218_00_JEBRQ", "$.messageText.successionDate");
        map.put("DE09_00_053_00_JARQ", "$.messageText.handShifDate");//交班日期
        map.put("DE09_00_053_00_JERQ", "$.messageText.catchShifDate");//接班日期
        map.put("DE06_00_298_00", "$.messageText.assessmentPlan");
        map.put("DE02_01_039_00", "$.messageText.patientInfo.name");
        map.put("DE02_01_040_00", "$.messageText.patientInfo.sex");
        map.put("DE05_10_148_00", "$.messageText.admissionSituation");
        map.put("DE06_00_184_00", "$.messageText.currentSituation");
        map.put("DE06_00_296_00", "$.messageText.treatment");//诊疗经过
        map.put("DE04_01_119_00", "$.messageText.complaint");//主诉
        map.put("DE05_01_024_00_MQZD", "$.messageText.currentDiagnosis");//目前诊断



        //时间字段
        map.put("DE06_00_218_00_JBRQ", "$.messageText.emrRecord.recTime");
        //新增字段
        map.put("pid", "$.pid");
        //多余字段
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.nativePlace");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.maritalStatus");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.nation");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.occupation");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.homePlace");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.address");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.dischargeTime");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.recordingTime");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.medicalHistoryProvider");
//        map.put("DE02_01_040_00", "$.messageText.patientInfo.telephone");
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
//    public void ParseJson() {
//        try{
//            String json = FileUtils.readFileByLines(getJsonPath());
//            ReadContext context = JsonPath.parse(json);
//            insertData(getMap(), getTableName(), context);
//        }catch (Exception e){
//            e.printStackTrace();
////            log.error("解析异常："+e);
//        }
////        log.debug("解析成功：");
//    }
//    public void insertData(Map<String,Object> map,String tableName,ReadContext context){
//        String inssql = "insert into "+tableName;
//        String uptsql = "update "+tableName+" set ";
//        StringBuffer keyStr = new StringBuffer();
//        StringBuffer valueStr = new StringBuffer();
//        StringBuffer uptstr = new StringBuffer();
//        String petient = "";
//        for (Map.Entry<String,Object> entry : map.entrySet()) {
//
//            Object tempVal = entry.getValue().toString().contains("$.")? FileUtils.getNode(context, (String) entry.getValue()):entry.getValue();
//            if(null!= tempVal && !tempVal.toString().isEmpty() ){
//                keyStr.append(entry.getKey()+",");
//                valueStr.append("'"+tempVal+"',");
//                uptstr.append(entry.getKey()+"='"+tempVal+"',");
//            }
//            if("DOCUMENT_UNIQUE_ID".equals(entry.getKey())){
//                petient = tempVal.toString();
//            }
//        }
//
//        //先查询数据库是否存在
//        String datesql = "select * from "+tableName+" where DOCUMENT_UNIQUE_ID = '"+petient+"'";
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList(datesql);
//        if(null!=maps && maps.size()>0){//修改
//            uptstr.deleteCharAt(uptstr.length()-1);
//            uptstr.append(" where DOCUMENT_UNIQUE_ID='" + petient + "'");
//            uptsql+=uptstr.toString();
//            jdbcTemplate.update(uptsql);
//        }else{//新增
//            //删除最后一个逗号
//            keyStr.deleteCharAt(keyStr.length()-1);
//            valueStr.deleteCharAt(valueStr.length()-1);
//            inssql+="("+keyStr.toString()+") values("+valueStr.toString()+")";
//            jdbcTemplate.execute(inssql);
//        }
//
//    }
    @Override
    public String getJsonPath() {
        return "./json/接班记录json示例.json";
    }
    @Override
    public String getTableName() {
        return "HDSD00_14_09";
    }
}