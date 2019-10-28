package com.ats.job.server;


import com.ats.job.bean.CDAData;
import com.ats.job.constants.ClomnsConstants;
import com.ats.job.thymeleaf.Thymeleaf;
import com.ats.job.tool.CdaTool;
import com.ats.job.tool.StringUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import javax.annotation.PostConstruct;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;


public class CDACreateServer extends Thread {

    private static final Logger log = LoggerFactory.getLogger(CDACreateServer.class);
    private JdbcTemplate jdbcTemplate;
    private JdbcTemplate jdbcTemplateHLHT;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void setJdbcTemplateHLHT(JdbcTemplate jdbcTemplateHLHT) {
        this.jdbcTemplateHLHT = jdbcTemplateHLHT;
    }
    private String filePath;
    private String convert;
    private int runNumber;
    private static String templatePath;
    private int foreachCount;
    private String pathKey;
    private  Thymeleaf thymeleaf =new Thymeleaf();
    private Map<String,String> clomnMap = ClomnsConstants.getClomns();
    // <表名, <documentuniqueid, 单行>>


    public CDACreateServer() {
    }

    public void run() {
    }
    @PostConstruct
    public void setCDA(){
        try {
            Properties properties = new Properties();
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
            String queSql = "select * from FILESYSTEM where pk=1";
            String temSql = "select * from FILESYSTEM where pk=2";
            List<Map<String, Object>> pathMap = jdbcTemplate.queryForList(queSql);
            List<Map<String, Object>> tempMap = jdbcTemplate.queryForList(temSql);
            runNumber++;
            filePath = pathMap.get(0).get("DIRPATH").toString();
//            filePath="D://CDA_DP/";
            pathKey = pathMap.get(0).get("PK").toString();
            templatePath=tempMap.get(0).get("DIRPATH").toString();
            convert = StringUtils.isValue(properties.get("CONVERT"));
            foreachCount =200;
        } catch (Exception e) {
            log.error("未定义配置文件中的文件生成目录!  "+e);
            return;
        }
        if (!Boolean.valueOf(convert)) return;

        log.info(Thread.currentThread().getName() + " starting.");
        try {
            String queSql = "select * from TABLE_DSMT";
            List<Map<String, Object>> pathMap = jdbcTemplate.queryForList(queSql);
            for(Map<String, Object> m:pathMap){
                new Thread(new Thread2(m.get("TABLE_NAME")+"")).start();
            }
        } catch (Exception exc) {
        log.error(Thread.currentThread().getName() + " interrupted:" + exc);
    }
        log.info(Thread.currentThread().getName() + " exiting.");
    }

    public String getTemplate(String docType) {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("templates/" + docType + ".xml");
        if (is == null) return "文档类型不存在(" + docType + ")";
        try {
            String result = IOUtils.toString(is, String.valueOf(StandardCharsets.UTF_8));
            return result;
        } catch (IOException e) {
            return e.getMessage();
        } finally {
            IOUtils.closeQuietly(is);
        }
    }

    public String saveTemplate(String docType, String xml) {
        URL path = Thread.currentThread().getContextClassLoader().getResource("templates/" + docType + ".xml");
        String tmplPath=path.getPath().replaceAll("%20"," ");
        File file = new File(tmplPath);
        if (!file.exists()) return "文档类型不存在(" + docType + ")";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(tmplPath);
            IOUtils.write(xml, fos,String.valueOf(StandardCharsets.UTF_8));
            return "";
        } catch (Exception e) {
            return e.getMessage();
        } finally {
            IOUtils.closeQuietly(fos);
        }
    }
    public void initCDADataThread(String tableName) {
        System.out.println(tableName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 循环任务中，查询未生成cda数据,将信息封装于map
     */
    public void initCDAData(String tableNames) {
            String tableName = tableNames;
            //过滤其他副本，保留主表
            boolean tableFlag = tableName.replace("HDSD00_","").matches(".*[a-zA-Z]+.*");
            if(tableFlag || "HDSD00_16_01".equals(tableName) || "HDSD00_02_01".equals(tableName)|| "HDSD00_02_03".equals(tableName)|| "HDSD00_02_04".equals(tableName)){
                return;
            }else{
                try{
                    //添加时间控制为当前时间提前五分钟的数据
                    String timeClo = CdaTool.getTimeClo(tableName);
                    String afterSql = "";
                    if(StringUtils.isNotBlank(timeClo)){
                        afterSql = " and "+timeClo+"<="+CdaTool.getTimeBefore(Calendar.getInstance());
                    }
                    //实时任务替换所有为空的字段为'-'或'0' ,等测评过后看看是否需要使用？？？？
//                    String clomnName = StringUtils.isNotBlank(clomnMap.get(tableName))?clomnMap.get(tableName):"*";
//                    sql = "select "+clomnName+" from " + tableName + " where rownum < " + foreachCount+ " and status = 0"+afterSql;
                    String sql = "select * from " + tableName + " where rownum <= 200  and status = 0";
                    List<Map<String, Object>> tableList = jdbcTemplate.queryForList(sql);
                    if(tableList.size()>0){
                        long startTime = System.currentTimeMillis();    //获取开始时间
                            Map<String, Map<String, CDAData>> CDADataMap = new HashMap<>();
                            Map<String, CDAData> CDARow = new HashMap<String,CDAData>();
                            for (Map<String, Object> colMap : tableList) {
                                //子类循环数据的添加
                                fillSonContext(tableName,colMap);
                                CDAData cdaData = new CDAData(colMap);
                                CDARow.put(cdaData.getDocumentUniqueId(), cdaData);
                            }
                        long endTime = System.currentTimeMillis();    //获取结束时间
                        log.error("程序运行时间fillSonContext：" + (endTime - startTime) + "ms，"+tableName);    //输出程序运行时间
                          startTime = System.currentTimeMillis();    //获取开始时间
                            CDADataMap.put(tableName, CDARow);
                            DisposeByThymeleaf(CDADataMap);
                            CDADataMap.clear();
                          endTime = System.currentTimeMillis();    //获取结束时间
                        log.error("程序运行时间DisposeByThymeleaf：" + (endTime - startTime) + "ms，"+tableName);    //输出程序运行时间
                        System.out.println();
                    }
                }catch (Exception e){
                    log.error("报错："+e);
                }
            }
    }




    /**
     * 生成xml文档，更新状态
     */
    public void DisposeByThymeleaf(Map<String, Map<String, CDAData>> CDADataMap ) {
        Map<String, Object> dateMap = null;
        for (Map.Entry<String, Map<String, CDAData>> tableEntry : CDADataMap.entrySet()) {
            String tableName = com.ats.job.tool.StringUtils.isValue(tableEntry.getKey());
            Map<String, CDAData> rowMap = tableEntry.getValue();
            List<Map<String, Object>> list =  new ArrayList<>();
            List<Map<String, Object>> listupdate =  new ArrayList<>();
            for (Map.Entry<String, CDAData> colEntry : rowMap.entrySet()) {
                String errorFlag = "1";
                String fileDirPath = "";
                String fileDirPath1="";
                CDAData cdaData = colEntry.getValue();
                try {
                    Map<String,Object> msgMap = getCDAMsg(cdaData,tableName);
                    Map<String,Object> msgMapUpdate =new HashedMap();
                    //姓名
                    Object patientName = msgMap.get("NAME");
                    //姓名不为空，门诊号住院号有一个不为空
                    if((null!=patientName && StringUtils.isBlank(patientName.toString())) || StringUtils.isBlank((String) msgMap.get("ADMISSION_TYPE"))){
                        log.debug("类型："+tableName+"主键："+cdaData.getCustomCol("PK")+"错误："+(StringUtils.isBlank(patientName.toString()) ? "姓名不能为空。" :"门诊号和住院号不能同时为空。"));
                        msgMapUpdate.put("tableName",tableName);
                        msgMapUpdate.put("errorFlag","-1");
                        msgMapUpdate.put("fileDirPath",fileDirPath.replace("'",""));
                        msgMapUpdate.put("pathKey",pathKey);
                        msgMapUpdate.put("PK",cdaData.getPk());
                        listupdate.add(msgMapUpdate);
                        throw new NullPointerException((StringUtils.isNotBlank((String) msgMap.get("NAME")) ? "姓名不能为空。" :"门诊号和住院号不能同时为空。"));
                    }
                    dateMap = new HashMap<>();
                    dateMap.put("cdaData", cdaData);
                    String tepStr = docNameConvert(tableName);
                    //保存路径
                    String savepath = CdaTool.getRepositoryItemPath(tepStr.substring(1,tepStr.length()-1)+"/",patientName.toString());//+patientName +"/";
                    //生成文件路径名称
                    String cdaName = "/EMR-SD" +docNameConvert(tableName)+cdaData.getPk() + ".xml";
                    fileDirPath = savepath + cdaName;
                    msgMap.put("DOC_PATH","/"+fileDirPath);
                    //生成xml文件
                    thymeleaf.saveNetCdaXml(tableName, dateMap, filePath + savepath, cdaName,templatePath,msgMap,jdbcTemplateHLHT);
                    list.add(msgMap);
                    msgMapUpdate.put("tableName",tableName);
                    msgMapUpdate.put("errorFlag",errorFlag);
                    msgMapUpdate.put("fileDirPath",fileDirPath.replace("'",""));
                    msgMapUpdate.put("pathKey",pathKey);
                    msgMapUpdate.put("PK",cdaData.getPk());
                    listupdate.add(msgMapUpdate);
                    //使用出院记录的数据生成出院小结
                    String tepStr1;
                    String savepath1;
                    String cdaName1;
                } catch (Exception e) {
                    log.error(tableName + "-" + cdaData.getPk() + "[" + e.getMessage() + "]");
                }
            }
            try {
                List<Map<String, Object>> docUpdateList =  new ArrayList<>();
                //插入doc
                if(list.size()!=0){
                    long startTime = System.currentTimeMillis();    //获取开始时间
                    String sql ="INSERT INTO \"HLHT\".\"DOC\" (\n" +
                            "\t\"PK\", \n" +
                            "\t\"DOC_TYPE_DEPICT\", \n" +
                            "\t\"DOC_VERSION_NO\",\n" +
                            "\t\"SYSTEM_DIR_PK\",\n" +
                            "\t\"DOC_PATH\",\n" +
                            "\t\"PATIENT_ID\", \n" +
                            "\t\"IDENTITY_NO\",\n" +
                            "\t\"NAME\",\n" +
                            "\t\"HOSPITAL_CODE\",\n" +
                            "\t\"HOSPITAL_NAME\", \n" +
                            "\t\"CREATE_TIME\", \n" +
                            "\t\"IN_TIME\",\n" +
                            "\t\"OUT_TIME\", \n" +
                            "\t\"ADMISSION_TYPE\", \n" +
                            "\t\"DOC_TYPE\",\n" +
                            "\t\"DOCUMENT_ID\", \n" +
                            "\t\"DOC_CREATION_TIME\", \n" +
                            "\t\"ADMISSION_DEPART\" \n" +
                            ")\n" +
                            "VALUES\n" +
                            "\t(\n" +
                            "\t\t hlht.DOC_SEQ.NEXTVAL, \n" +
                            "\t\t?,\n" +
                            "\t\t?, \n" +
                            "\t\t?,\n" +
                            "\t\t?,\n" +
                            "\t\t?, \n" +
                            "\t\t?,\n" +
                            "\t\t?,\n" +
                            "\t\t?,\n" +
                            "\t\t?, \n" +
                            "\t\t?, \n" +
                            "\t\t?,\n" +
                            "\t\t?, \n" +
                            "\t\t?, \n" +
                            "\t\t?,\n" +
                            "\t\t?,\n" +
                            "\t\t?,\n" +
                            "\t\t? \n" +
                            "\t)";
                    int[] count = (int[])jdbcTemplate.execute(sql, new PreparedStatementCallback(){
                        public Object doInPreparedStatement(PreparedStatement ps)throws SQLException, DataAccessException {
                            ps.getConnection().setAutoCommit(false);
                            for(Map<String, Object> m:list){
                                //判断doc是否存在重复
                                String sql = "select pk from  hlht.doc where DOCUMENT_ID='"+m.get("DOCUMENT_ID")+"' and DOC_TYPE = '"+m.get("DOC_TYPE")+"'";
                                List<Map<String, Object>> docList = jdbcTemplate.queryForList(sql);
                                    if(docList.size()>0){
                                        docUpdateList.add(m);
                                        continue;
                                    }
                                ps.setString(1,m.get("DOC_TYPE_DEPICT")+"");
                                ps.setString(2,m.get("DOC_VERSION_NO")+"");
                                ps.setInt(3, Integer.parseInt(m.get("SYSTEM_DIR_PK")+""));
                                ps.setString(4,m.get("DOC_PATH")+"");
                                ps.setString(5,m.get("patient_id")+"");
                                ps.setString(6,m.get("IDENTITY_NO")+"");
                                ps.setString(7,m.get("NAME")+"");
                                ps.setString(8,m.get("HOSPITAL_CODE")+"");
                                ps.setString(9,m.get("HOSPITAL_NAME")+"");
                                ps.setTimestamp(10, new Timestamp(System.currentTimeMillis()));
                                ps.setString(11,m.get("IN_TIME")+"");
                                ps.setString(12,m.get("OUT_TIME")+"");
                                ps.setString(13,m.get("ADMISSION_TYPE")+"");
                                ps.setString(14,m.get("DOC_TYPE")+"");
                                ps.setString(15,m.get("DOCUMENT_ID")+"");
                                ps.setString(16,m.get("DOC_CREATION_TIME")+"");
                                ps.setString(17,m.get("ADMISSION_DEPART")+"");
                                ps.addBatch();
                            }
                            Object o = ps.executeBatch();
                            ps.getConnection().commit();
                            ps.getConnection().setAutoCommit(true);
                            return  o;
                        }});
                    long endTime = System.currentTimeMillis();
                    log.error("程序运行时间PreparedStatementCallback：" + (endTime - startTime) + "ms，"+tableName+"更新"+count.length+"数据");
                }
                //更新DOC
                if(docUpdateList.size()>0){
                    long startTime = System.currentTimeMillis();    //获取开始时间
                    String sql="UPDATE HLHT.DOC \n" +
                            "SET  \n" +
                            "DOC_TYPE_DEPICT = ?,\n" +
                            "DOC_CREATION_TIME = ?, \n" +
                            "DOC_VERSION_NO = ?,\n" +
                            "SYSTEM_DIR_PK =?,\n" +
                            "DOC_PATH = ?,\n" +
                            "PATIENT_ID = ?, \n" +
                            "NAME = ?,\n" +
                            "HOSPITAL_CODE = ?,\n" +
                            "HOSPITAL_NAME =?, \n" +
                            "CREATE_TIME =?, \n" +
                            "IN_TIME = ?, \n" +
                            "OUT_TIME = ?, \n" +
                            "ADMISSION_TYPE = ?, \n" +
                            "DOC_TYPE = ?,\n" +
                            "IDENTITY_NO = ?,\n" +
                            "ADMISSION_DEPART = ?\n" +
                            "WHERE\n" +
                            "\tDOCUMENT_ID = ? and DOC_TYPE=?";
                    int[] count = (int[])jdbcTemplate.execute(sql, new PreparedStatementCallback(){
                        public Object doInPreparedStatement(PreparedStatement ps)throws SQLException, DataAccessException {
                            ps.getConnection().setAutoCommit(false);
                            for(Map<String, Object> m:list){
                                ps.setString(1,m.get("DOC_TYPE_DEPICT")+"");
                                ps.setString(2,m.get("DOC_CREATION_TIME")+"");
                                ps.setString(3,m.get("DOC_VERSION_NO")+"");
                                ps.setInt(4, Integer.parseInt(m.get("SYSTEM_DIR_PK")+""));
                                ps.setString(5,m.get("DOC_PATH")+"");
                                ps.setString(6,m.get("patient_id")+"");
                                ps.setString(7,m.get("NAME")+"");
                                ps.setString(8,m.get("HOSPITAL_CODE")+"");
                                ps.setString(9,m.get("HOSPITAL_NAME")+"");
                                ps.setTimestamp(10, new Timestamp(System.currentTimeMillis()));
                                ps.setString(11,m.get("IN_TIME")+"");
                                ps.setString(12,m.get("OUT_TIME")+"");
                                ps.setString(13,m.get("ADMISSION_TYPE")+"");
                                ps.setString(14,m.get("DOC_TYPE")+"");
                                ps.setString(15,m.get("IDENTITY_NO")+"");
                                ps.setString(16,m.get("ADMISSION_DEPART")+"");
                                ps.setString(17,m.get("DOCUMENT_ID")+"");
                                ps.setString(18,m.get("DOC_TYPE")+"");
                                ps.addBatch();
                            }
                            Object o = ps.executeBatch();
                            ps.getConnection().commit();
                            ps.getConnection().setAutoCommit(true);
                            return  o;
                        }});
                    long endTime = System.currentTimeMillis();
                    log.error("程序运行时间docUpdateList：" + (endTime - startTime) + "ms，"+tableName+":"+"更新"+count.length+"数据");
                }
                if(listupdate.size()!=0){
                    long startTime = System.currentTimeMillis();    //获取开始时间
                    String uptSql = "update "+tableName+" set status = ? , FILE_PATH = ? , DIR_PK=? where pk =?";
                    int[] counts = (int[])jdbcTemplate.execute(uptSql, new PreparedStatementCallback(){
                        public Object doInPreparedStatement(PreparedStatement ps)throws SQLException, DataAccessException {
                            ps.getConnection().setAutoCommit(false);
                            for(Map<String, Object> m:listupdate){
                                ps.setString(1,m.get("errorFlag")+"");
                                ps.setString(2, m.get("fileDirPath")+"");
                                ps.setString(3,m.get("pathKey")+"");
                                ps.setString(4,m.get("PK")+"");
                                ps.addBatch();
                            }
                            Object o = ps.executeBatch();
                            ps.getConnection().commit();
                            ps.getConnection().setAutoCommit(true);
                            return  o;
                        }});
                    long endTime = System.currentTimeMillis();
                    log.error("程序运行时间updatetableName：" + (endTime - startTime) + "ms，"+tableName);
                }
            } catch (Exception  e) {
                log.error(e+"");
            }
        }
    }

    /**
     * 获取互联互通所需的基本字段信息
     * @param cdaData
     * @param tableName
     * @return
     */
    public Map<String,Object> getCDAMsg(CDAData cdaData,String tableName){
        Map<String,Object> msgMap =new HashMap<String,Object>();
        //姓名
        msgMap.put("NAME",cdaData.getCustomCol("DE02_01_039_00"));
        msgMap.put("FILE_PATH",cdaData.getCustomCol("FILE_PATH"));
        //身份证
        msgMap.put("IDENTITY_NO",cdaData.getCustomCol("DE02_01_030_00"));
        if(msgMap.get("IDENTITY_NO")==null||(msgMap.get("IDENTITY_NO")+"").equals("")){
            msgMap.put("IDENTITY_NO",cdaData.getCustomCol("DE02_01_031_00"));
        }
        //住院号
        String zyHao = cdaData.getCustomCol("DE01_00_014_00");
        //门诊号
        String mzHao = cdaData.getCustomCol("DE01_00_010_00");
        //就诊类型描述
        String patType="";
        if(StringUtils.isNotBlank(zyHao)){
            patType = "住院";
            msgMap.put("patient_id",zyHao);
        }else if(StringUtils.isNotBlank(mzHao)){
            patType = "门诊";
            msgMap.put("patient_id",mzHao);
        }
        msgMap.put("ADMISSION_TYPE",patType);
        //医院代码
        msgMap.put("HOSPITAL_CODE",cdaData.getCustomCol("DE08_10_052_00"));
        //医院名称
        msgMap.put("HOSPITAL_NAME",cdaData.getCustomCol("DE08_10_052_00_NAME"));
        //主治医生
        msgMap.put("REPOSITORY_UNIQUE_ID",cdaData.getCustomCol("major_doctor"));
        //就诊科室
        //DE08_10_026_00_RYKS
        msgMap.put("ADMISSION_DEPART",cdaData.getCustomCol("DE08_10_026_00"));
        if(msgMap.get("ADMISSION_DEPART")==null||(msgMap.get("ADMISSION_DEPART")+"").equals("")){
            msgMap.put("ADMISSION_DEPART",cdaData.getCustomCol("DE08_10_026_00_KSMC"));
            if(msgMap.get("ADMISSION_DEPART")==null||(msgMap.get("ADMISSION_DEPART")+"").equals("")){
                msgMap.put("ADMISSION_DEPART",cdaData.getCustomCol("DE08_10_026_00_RYKS"));
            }
        }
        //创建时间
        msgMap.put("CREATE_TIME","to_timestamp('"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())+"','yyyy-mm-dd hh24:mi:ss.ff')");
        msgMap.put("DOC_CREATION_TIME",new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()));
        //文档类型
        msgMap.put("DOC_TYPE",tableName);
        //文档类型名称
        String typeName = docNameConvert(tableName);
        msgMap.put("DOC_TYPE_DEPICT",typeName.substring(4,typeName.length()-1));
        msgMap.put("DOC_VERSION_NO","");
        msgMap.put("SYSTEM_DIR_PK",'1');
        //文档ID
        msgMap.put("DOCUMENT_ID",cdaData.getCustomCol("PK"));
        //入院时间
        if("HDSD00_04_01".equals(tableName)||"HDSD00_04_02".equals(tableName)){
            msgMap.put("IN_TIME",cdaData.getCustomCol("DE08_50_033_00")+"000000");
        }else if("HDSD00_06_04".equals(tableName)){
            msgMap.put("IN_TIME",cdaData.getCustomCol("DE09_00_053_00_RYSJ"));
        }else{
            msgMap.put("IN_TIME",cdaData.getCustomCol("DE06_00_092_00"));
        }

        //出院时间
        msgMap.put("OUT_TIME",cdaData.getCustomCol("DE06_00_017_00"));
        return msgMap;
    }
    /**
     * 新增xml文件插入互联互通数据库
     * @param msgMap
     * @param jdbcTemplateHLHT
     */
    public static void saveFileMsg(Map<String, Object> msgMap, JdbcTemplate jdbcTemplateHLHT){
        String pathSql = "insert into hlht.DOC";
        StringBuffer keyStr = new StringBuffer("PK,");
        StringBuffer valueStr = new StringBuffer("hlht.DOC_SEQ.NEXTVAL,");
        for (Map.Entry<String,Object> entry : msgMap.entrySet()) {
            Object tempValue=entry.getValue();
            //如果包含to_timestamp 去掉引号
            if(null!=tempValue && tempValue.toString().contains("to_timestamp")){
                tempValue = "" +tempValue+ ",";
            }else{
                tempValue = "'" +tempValue+ "',";
            }
            keyStr.append(entry.getKey()+ ",");
            valueStr.append(tempValue);
        }
        //删除最后一个逗号
        keyStr.deleteCharAt(keyStr.length()-1);
        valueStr.deleteCharAt(valueStr.length()-1);
        pathSql+="("+keyStr.toString()+") values("+valueStr.toString()+")";
        log.debug("插入互联互通sql:"+pathSql);
        jdbcTemplateHLHT.execute(pathSql);
    }


    /**
     * 根据不同的表名，添加文档包含的子循环，或其他信息
     * @param tableName
     * @param colMap
     */
    public void fillSonContext(String tableName,Map<String,Object> colMap){
        try{
            //添加子循环或其他内容
            switch (tableName){
                case "HDSD00_02_02" :
                    // 对0203做子关联
                    //1..1
                    String sql = "select * from HDSD00_02_03 where visit_flow_id = '" + colMap.get("VISIT_FLOW_ID") + "'";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ;
                    List<Map<String, Object>> tableList = jdbcTemplate.queryForList(sql);
                    colMap.put("HDSD00_02_03", tableList.size()>0?tableList.get(0):new HashMap<String,Object>());
                    // 对0201做子关联
                    sql = "select * from HDSD00_02_01 where visit_flow_id = '" + colMap.get("VISIT_FLOW_ID") + "'";
                    tableList = jdbcTemplate.queryForList(sql);
                    //02_02添加门诊号
                    if(null != tableList && tableList.size()>0){
                        colMap.put("DE01_00_010_00",tableList.get(0).get("DE01_00_010_00"));
                        colMap.put("DE01_00_014_00",tableList.get(0).get("DE01_00_014_00"));
                    }
                    log.debug("\n01门诊{};\n02门诊号：{}",(tableList.size()>0?tableList.get(0).get("DE01_00_010_00"):"空"),colMap.get("DE01_00_010_00"));
                    Map<String,Object> zdmap = tableList.size()>0?tableList.get(0):new HashMap<String,Object>();
                    //添加药物
                    sql = "select * from HDSD00_02_01_YY where DE01_00_010_014_00 = '" + zdmap.get("pk") + "'";
                    tableList = jdbcTemplate.queryForList(sql);
                    zdmap.put("DE08_50_022_00",tableList);
                    //添加手术
                    sql = "select * from HDSD00_SS where pk = '" + zdmap.get("pk") + "'";
                    tableList = jdbcTemplate.queryForList(sql);
                    zdmap.put("DE06_00_093_00",tableList);
                    //添加诊断
                    sql = "select * from HDSD00_ZD where pk = '" + zdmap.get("pk") + "' and TABLE_NAME='"+tableName+"'";
                    tableList = jdbcTemplate.queryForList(sql);
                    zdmap.put("DE05_01_024_00",tableList);
                    colMap.put("HDSD00_02_01", zdmap);
                    // 对0204做子关联
                    sql = "select * from HDSD00_02_04 where visit_flow_id = '" + colMap.get("VISIT_FLOW_ID") + "'" ;
                    tableList = jdbcTemplate.queryForList(sql);
                    colMap.put("HDSD00_02_04", tableList.size()>0?tableList.get(0):new HashMap<String,Object>());
                    break;
                case "HDSD00_05_01" :
                    //获取诊断信息 temp
//                    getCureListByPK(colMap, "pk", "DE05_01_024_00",tableName);
                    String zdSql="select Distinct de05_01_024_00,de05_01_024_00_name From hdsd00_zd where  pk='"+colMap.get("pk")+"'";
                    List<Map<String, Object>> zdxx = validateList(jdbcTemplate.queryForList(zdSql));
                    List<Map<String, Object>> newList = new ArrayList<Map<String, Object>>();
                    for (int i = 0; i < zdxx.size(); i++) {
                        Map<String, Object> stringObjectMap = zdxx.get(i);
                        stringObjectMap.put("DE05_01_024_00",stringObjectMap.get("DE05_01_024_00")==null?null:stringObjectMap.get("DE05_01_024_00").toString().replace("？","†"));
                        stringObjectMap.put("DE05_01_024_00_NAME",stringObjectMap.get("DE05_01_024_00_NAME")==null?null:stringObjectMap.get("DE05_01_024_00_NAME").toString().replace("？","†"));
                        newList.add(stringObjectMap);
                    }
                    colMap.put("DE05_01_024_00",newList);

                    String Sql="select * from HDSD00_05_01_JYXM WHERE DE01_00_003_00='"+colMap.get("DE01_00_003_00")+"'";
                    List<Map<String, Object>> jybgList = jdbcTemplate.queryForList(Sql);
                    colMap.put("DE04_30_015_00",jybgList);
                    break;
                case "HDSD00_05_02" :
                    //获取诊断信息 temp
//                    getCureListByPK(colMap, "pk", "DE05_01_024_00",tableName);
                    zdSql="select Distinct de05_01_024_00,de05_01_024_00_name From hdsd00_zd where  pk='"+colMap.get("pk")+"'";
                     zdxx =validateList( jdbcTemplate.queryForList(zdSql));
                     newList = new ArrayList<Map<String, Object>>();
                    for (int i = 0; i < zdxx.size(); i++) {
                        Map<String, Object> stringObjectMap = zdxx.get(i);
                        stringObjectMap.put("DE05_01_024_00",stringObjectMap.get("DE05_01_024_00")==null?null:stringObjectMap.get("DE05_01_024_00").toString().replace("？","†"));
                        stringObjectMap.put("DE05_01_024_00_NAME",stringObjectMap.get("DE05_01_024_00_NAME")==null?null:stringObjectMap.get("DE05_01_024_00_NAME").toString().replace("？","†"));
                        newList.add(stringObjectMap);
                    }
                    colMap.put("DE05_01_024_00",newList);


                    //获取手术信息
                    String sSql ="select * from HDSD00_SS where pk = '"+colMap.get("PK")+"' AND TABLE_NAME='"+tableName+"'";
                    List<Map<String, Object>> maps = jdbcTemplate.queryForList(sSql);
                    colMap.put("DE06_00_094_00",maps);
                    break;
                case "HDSD00_04_01" :
                    //获取诊断信息 temp
                    getCureListByPK(colMap, "pk", "DE05_01_024_00",tableName);

                    String xyzdSql="select * from HDSD00_04_COM_CFYY WHERE CHUFANGID='"+colMap.get("DE01_00_020_00")+"'";
                    List<Map<String, Object>> xyzdyy = jdbcTemplate.queryForList(xyzdSql);
                    colMap.put("DE01_00_020_00_MX",xyzdyy);
                    //总费用计算
                    String doubleValue1 =getCount(xyzdyy)+"";
                    String substring = doubleValue1.substring(doubleValue1.indexOf(".")+1);
                    if(substring.length()==1){
                        doubleValue1=doubleValue1+"0";
                    }else if(substring.length()==0){
                        doubleValue1=doubleValue1+"00";
                    }
                    //总费用保存两位小数保存
                    colMap.put("DE07_00_004_00",doubleValue1);
                    //如果是退费，在备注添加提示
                    if(doubleValue1.toString().startsWith("-")){
                        colMap.put("DE06_00_179_00","此单为退单，退费");
                    }
                    break;
                case "HDSD00_04_02" :
                    //获取诊断信息 temp
                    getCureListByPK(colMap, "pk", "DE05_01_024_00",tableName);

                    String zyzdSql="select * from HDSD00_04_COM_CFYY WHERE CHUFANGID='"+colMap.get("DE01_00_020_00")+"'";
                    List<Map<String, Object>> zyzdyy = jdbcTemplate.queryForList(zyzdSql);
                    colMap.put("DE01_00_020_00_MX",zyzdyy);
                    doubleValue1 =getCount(zyzdyy)+"";
                    substring = doubleValue1.substring(doubleValue1.indexOf(".")+1);
                    if(substring.length()==1){
                        doubleValue1=doubleValue1+"0";
                    }else if(substring.length()==0){
                        doubleValue1=doubleValue1+"00";
                    }
                    //总费用保存两位小数保存
                    colMap.put("DE07_00_004_00",doubleValue1);
                    //如果是退费，在备注添加提示
                    if(doubleValue1.toString().startsWith("-")){
                        colMap.put("DE06_00_179_00","此单为退单，退费");
                    }
                    break;
                case "HDSD00_10_03" :
                    //获取诊断信息 temp
                     zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_ZD",xyzdyy);
                    break;
                case "HDSD00_13_01" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE not in ('3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_13_01_RYZD",xyzdyy);
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE not in ('5','4')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_13_01_CYZD",xyzdyy);
                    break;
                case "HDSD00_06_01" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE  in ('4','1')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_06_01_RYZD",xyzdyy);
                    break;
                case "HDSD00_06_03" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE  in ('4','1')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    //获取手术操作编码
                    String  ssSql03="select * from HDSD00_SS WHERE pk='"+colMap.get("PK")+"' and DE06_00_093_00 is not null";
                    List<Map<String, Object>> xyssyy03  = jdbcTemplate.queryForList(ssSql03);
                    colMap.put("HDSD00_06_03_SSBM",xyssyy03);
                    colMap.put("HDSD00_06_03_RYZD",xyzdyy);
                    break;
                case "HDSD00_03_02" :
                    //获取诊断信息 temp
                    getCureListByPK(colMap, "pk", "DE05_01_024_00",tableName);
                    String yzSql = "select * from HDSD00_03_02_YZ where pk='"+colMap.get("PK")+"'";
                    List<Map<String, Object>> yzList = jdbcTemplate.queryForList(yzSql);
                    colMap.put("DE06_00_288_00",yzList);
                    break;
                case "HDSD00_13_02" :
                    //初步诊断 temp
                    zdSql=" select   DE05_01_024_00_NAME,DE05_01_024_00,QZRQ from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE ='cbzd'";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_13_02_DE05_01_025_00_CBZD",xyzdyy);
                    //修正诊断
//                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00,QZRQ from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE ='11'";
//                    xyzdyy = handleSpecialCharacter(zdSql);
//                    colMap.put("HDSD00_13_02_DE05_01_024_00_XZZD",xyzdyy);
                    //入院主诊断
                    zdSql=" select   DE05_01_024_00_NAME,DE05_01_024_00,QZRQ from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE ='2'";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_13_02_DE05_01_024_00_QDZD",xyzdyy);
//                    //补充诊断
//                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00,QZRQ from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE ='12'";
//                    xyzdyy = handleSpecialCharacter(zdSql);
//                    colMap.put("HDSD00_13_02_DE05_01_024_00_BCZD",xyzdyy);

                    break;
                case "HDSD00_10_05" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_10_05_DE05_01_024_00",xyzdyy);
                    //获取入院诊断信息 temp
                    zdSql="select * from HDSD00_XY WHERE pk='"+colMap.get("PK")+"' and DE08_50_040_00 is not null";
                    xyzdyy = jdbcTemplate.queryForList(zdSql);
                    colMap.put("HDSD00_10_05_DE08_50_040_00",xyzdyy);
                    break;
                case "HDSD00_13_03" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('2','3')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_13_03_DE05_01_024_00",xyzdyy);
                    //获取死亡诊断信息
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('swzd')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_13_03_DE05_01_024_00_SWZD",xyzdyy);
                    break;
                case "HDSD00_06_06" :
                    //获取手术信息
                    String ssSql1 ="select * from HDSD00_SS where pk = '"+colMap.get("PK")+"'";
                    List<Map<String, Object>> ssList = jdbcTemplate.queryForList(ssSql1);
                    colMap.put("DE06_00_094_00",ssList);
                    //获取出院院诊断信息
                    String shzdSql ="select DISTINCT * from HDSD00_ZD where pk = '"+colMap.get("PK")+"'and DE05_01_024_00_TYPE in ('4','5')";
                    List<Map<String, Object>> shzdList = jdbcTemplate.queryForList(shzdSql);
                    if(shzdList==null||shzdList.size()<=0){
                        shzdSql ="select DISTINCT * from HDSD00_ZD where pk = '"+colMap.get("PK")+"'";
                        shzdList = jdbcTemplate.queryForList(shzdSql);
                    }
                    colMap.put("DE05_01_024_00_SHZD",shzdList);
                    //获取入院诊断信息
                    String sqzdSql ="select DISTINCT * from HDSD00_ZD where pk = '"+colMap.get("PK")+"'and DE05_01_024_00_TYPE in ('2','3')";
                    List<Map<String, Object>> sqzdList = jdbcTemplate.queryForList(sqzdSql);
                    if(sqzdList==null||sqzdList.size()<=0){
                        sqzdSql ="select DISTINCT * from HDSD00_ZD where pk = '"+colMap.get("PK")+"'";
                        sqzdList = jdbcTemplate.queryForList(sqzdSql);
                    }
                    colMap.put("DE05_01_024_00_SQZD",sqzdList);
                    break;
                case "HDSD00_06_04" :
                    //药物信息
                    String medsSql="select * from HDSD00_06_COM_YY WHERE PATIENT_ID='"+colMap.get("pk")+"'";
                    List<Map<String, Object>> medsList = jdbcTemplate.queryForList(medsSql);
                    colMap.put("MEDICINES",medsList);
                    //获取手术信息
                    String ssSql ="select * from HDSD00_SS where pk = '"+colMap.get("PK")+"' AND TABLE_NAME='"+tableName+"'";
                    ssList = jdbcTemplate.queryForList(ssSql);
                    colMap.put("DE06_00_094_00",ssList);
                    //获取出院院诊断信息
                    shzdSql ="select * from HDSD00_ZD where pk = '"+colMap.get("PK")+"'and DE05_01_024_00_TYPE in ('4','5','6','7','8')"+ " and TABLE_NAME='"+tableName+"'";
                    shzdList = validateList(jdbcTemplate.queryForList(shzdSql));
                    colMap.put("DE05_01_024_00_SHZD",shzdList);
                    //获取入院诊断信息
                    sqzdSql ="select * from HDSD00_ZD where pk = '"+colMap.get("PK")+"'and DE05_01_024_00_TYPE in ('1','2','3')"+ " and TABLE_NAME='"+tableName+"'";
                    sqzdList = validateList(jdbcTemplate.queryForList(sqzdSql));
                    colMap.put("DE05_01_024_00_SQZD",sqzdList);
                    //获取所有诊断信息
                    sqzdSql ="select * from HDSD00_ZD where pk = '"+colMap.get("PK")+"' and TABLE_NAME='"+tableName+"'";
                    List<Map<String, Object>> sqzzdList = validateList(jdbcTemplate.queryForList(sqzdSql));
                    colMap.put("DE05_01_024_00_SQZD",sqzdList);
                    if(null==colMap.get("DE05_01_024_00_SHZD")){
                        colMap.put("DE05_01_024_00_SHZD",sqzzdList);
                    }
                    if(null==colMap.get("DE05_01_024_00_SQZD")){
                        colMap.put("DE05_01_024_00_SQZD",sqzzdList);
                    }
                    //处理生命体征
                    //paseSmtz(colMap,colMap.get("DE06_00_260_00")==null?"":colMap.get("DE06_00_260_00").toString());
                    break;
                case "HDSD00_14_06" :
                    //获取诊断信息
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE  in ('4','1')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_06_SHZD",xyzdyy);
                    //获取手术操作编码
                    zdSql="select * from HDSD00_SS WHERE pk='"+colMap.get("PK")+"' and DE06_00_093_00 is not null";
                    xyzdyy = jdbcTemplate.queryForList(zdSql);
                    colMap.put("HDSD00_14_06_SSBM",xyzdyy);
                    break;
                case "HDSD00_14_11" :
                    //获取诊断信息
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE  in ('4','1')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_11_ZDBM",xyzdyy);
                    //获取手术操作编码
                    zdSql="select * from HDSD00_SS WHERE pk='"+colMap.get("PK")+"' and DE06_00_093_00 is not null";
                    xyzdyy = jdbcTemplate.queryForList(zdSql);
                    colMap.put("HDSD00_14_11_SSBM",xyzdyy);
                    break;
                case "HDSD00_14_16" :
                    //获取诊断信息
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE  in ('4','5')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_16_SWZDBM",xyzdyy);

                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE  in ('2','1','3')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_16_RYZDBM",xyzdyy);
                    break;
                case "HDSD00_14_07" :
                    //获取诊断信息
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE  in ('4','1')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_07_ZDBM",xyzdyy);
                    break;
                case "HDSD00_09_01" :
                    //获取入院诊断信息
                    getCureListByPK(colMap, "PK", "DE05_01_024_00",tableName);
                    break;
                case "HDSD00_08_02" :
                    //获取入院诊断信息
                    getCureListByPK(colMap, "PK", "DE05_01_024_00",tableName);
                    //获取材料子循环
                    String clSql="select * from HDSD00_08_02_CL WHERE pk='"+colMap.get("PK")+"'";
                    List<Map<String, Object>> clList = jdbcTemplate.queryForList(clSql);
                    colMap.put("DE08_50_055_00",clList);
                    break;
                case "HDSD00_08_06" :
                    //获取入院诊断信息
                    getCureListByPK(colMap, "PK", "DE05_01_024_00",tableName);
                    //护理观察项目
                    String gcxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='1' and TABLE_NAME='"+tableName+"'";
                    List<Map<String, Object>> gcxlList = jdbcTemplate.queryForList(gcxmSql);
                    if(null!= gcxlList && gcxlList.size()<=0){
                        Map<String,Object> gcxmap = new HashMap<String,Object>();
                        gcxmap.put("PK",colMap.get("PK"));
                        gcxmap.put("DE06_00_209_00","-");
                        gcxmap.put("DE06_00_342_00","-");
                        gcxmap.put("DE06_00_210_00","-");
                        gcxlList.add(gcxmap);
                    }
                    colMap.put("DE02_10_031_00",gcxlList);
                    //护理操作项目
                    String czxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='2' and TABLE_NAME='"+tableName+"'";
                    List<Map<String, Object>> czxlList = jdbcTemplate.queryForList(czxmSql);
                    if(null!= czxlList && czxlList.size()<=0){
                        Map<String,Object> czxmap = new HashMap<String,Object>();
                        czxmap.put("PK",colMap.get("PK"));
                        czxmap.put("DE06_00_209_00","-");
                        czxmap.put("DE06_00_342_00","-");
                        czxmap.put("DE06_00_210_00","-");
                        czxlList.add(czxmap);
                    }
                    colMap.put("DE06_00_210_00",czxlList);
                    break;
                case "HDSD00_08_05" :
                    //获取入院诊断信息
                    getCureListByPK(colMap, "PK", "DE05_01_024_00",tableName);
                    //护理观察项目
                    gcxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='1' and TABLE_NAME='"+tableName+"'";
                    gcxlList = jdbcTemplate.queryForList(gcxmSql);
                    if(null!= gcxlList && gcxlList.size()<=0){
                        Map<String,Object> gcxmap = new HashMap<String,Object>();
                        gcxmap.put("PK",colMap.get("PK"));
                        gcxmap.put("DE06_00_209_00","-");
                        gcxmap.put("DE06_00_342_00","-");
                        gcxmap.put("DE06_00_210_00","-");
                        gcxlList.add(gcxmap);
                    }
                    colMap.put("DE02_10_031_00",gcxlList);
                    //护理操作项目
                    czxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='2' and TABLE_NAME='"+tableName+"'";
                    czxlList = jdbcTemplate.queryForList(czxmSql);
                    if(null!= czxlList && czxlList.size()<=0){
                        Map<String,Object> czxmap = new HashMap<String,Object>();
                        czxmap.put("PK",colMap.get("PK"));
                        czxmap.put("DE06_00_209_00","-");
                        czxmap.put("DE06_00_342_00","-");
                        czxmap.put("DE06_00_210_00","-");
                        czxlList.add(czxmap);
                    }
                    colMap.put("DE06_00_210_00",czxlList);
                    //获取手术信息
                    ssSql ="select * from HDSD00_SS where pk = '"+colMap.get("PK")+"'";
                    ssList = jdbcTemplate.queryForList(ssSql);
                    colMap.put("DE06_00_093_00",ssList);
                    break;
                case "HDSD00_08_03" :
                    //获取入院诊断信息
                    getCureListByPK(colMap, "PK", "DE05_01_024_00",tableName);
                    //护理观察项目
                    gcxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='1' and TABLE_NAME='"+tableName+"'";
                    gcxlList = jdbcTemplate.queryForList(gcxmSql);
                    if(null!= gcxlList && gcxlList.size()<=0){
                        Map<String,Object> gcxmap = new HashMap<String,Object>();
                        gcxmap.put("PK",colMap.get("PK"));
                        gcxmap.put("DE06_00_209_00","-");
                        gcxmap.put("DE06_00_342_00","-");
                        gcxmap.put("DE06_00_210_00","-");
                        gcxlList.add(gcxmap);
                    }
                    colMap.put("DE02_10_031_00",gcxlList);
                    break;
                case "HDSD00_08_04" :
                    //获取入院诊断信息
                    getCureListByPK(colMap, "PK", "DE05_01_024_00",tableName);
                    //护理观察项目
                    gcxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='1' and TABLE_NAME='"+tableName+"'";
                    gcxlList = jdbcTemplate.queryForList(gcxmSql);
                    if(null!= gcxlList && gcxlList.size()<=0){
                        Map<String,Object> gcxmap = new HashMap<String,Object>();
                        gcxmap.put("PK",colMap.get("PK"));
                        gcxmap.put("DE06_00_209_00","-");
                        gcxmap.put("DE06_00_342_00","-");
                        gcxmap.put("DE06_00_210_00","-");
                        gcxlList.add(gcxmap);
                    }
                    colMap.put("DE02_10_031_00",gcxlList);
                    //护理操作项目
                    czxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='2' and TABLE_NAME='"+tableName+"'";
                    czxlList = jdbcTemplate.queryForList(czxmSql);
                    if(null!= czxlList && czxlList.size()<=0){
                        Map<String,Object> czxmap = new HashMap<String,Object>();
                        czxmap.put("PK",colMap.get("PK"));
                        czxmap.put("DE06_00_209_00","-");
                        czxmap.put("DE06_00_342_00","-");
                        czxmap.put("DE06_00_210_00","-");
                        czxlList.add(czxmap);
                    }
                    colMap.put("DE06_00_210_00",czxlList);
                    //药物信息
                    medsSql="select * from HDSD00_06_COM_YY WHERE pk='"+colMap.get("pk")+"'";
                    medsList = jdbcTemplate.queryForList(medsSql);
                    if(null!= medsList && medsList.size()<=0){
                        Map<String,Object> yymap = new HashMap<String,Object>();
                        yymap.put("PK",colMap.get("PK"));
                        yymap.put("DE06_00_134_00","9");
                        yymap.put("DE06_00_134_00_NAME","其他用药途径");
                        yymap.put("DE06_00_135_00","0.00");
                        yymap.put("DE08_50_023_00","99");
                        yymap.put("DE06_00_133_00","其它");
                        yymap.put("DE08_50_022_00","-");
                        yymap.put("DE08_50_024_00","mg");
                        medsList.add(yymap);
                    }
                    colMap.put("DE08_50_022_00",medsList);
                    break;
                case "HDSD00_08_01" :
                    //获取入院诊断信息
                    getCureListByPK(colMap, "PK", "DE05_01_024_00",tableName);
                    //护理观察项目
                    gcxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='1' and TABLE_NAME='"+tableName+"'";
                    gcxlList = jdbcTemplate.queryForList(gcxmSql);
                    if(null!= gcxlList && gcxlList.size()<=0){
                        Map<String,Object> gcxmap = new HashMap<String,Object>();
                        gcxmap.put("PK",colMap.get("PK"));
                        gcxmap.put("DE06_00_209_00","-");
                        gcxmap.put("DE06_00_342_00","-");
                        gcxmap.put("DE06_00_210_00","-");
                        gcxlList.add(gcxmap);
                    }
                    colMap.put("DE02_10_031_00",gcxlList);
                    //护理操作项目
                    czxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='2' and TABLE_NAME='"+tableName+"'";
                    czxlList = jdbcTemplate.queryForList(czxmSql);
                    if(null!= czxlList && czxlList.size()<=0){
                        Map<String,Object> czxmap = new HashMap<String,Object>();
                        czxmap.put("PK",colMap.get("PK"));
                        czxmap.put("DE06_00_209_00","-");
                        czxmap.put("DE06_00_342_00","-");
                        czxmap.put("DE06_00_210_00","-");
                        czxlList.add(czxmap);
                    }
                    colMap.put("DE06_00_210_00",czxlList);
                    break;
                case "HDSD00_11_01" :
                    //门（急）诊诊断-疾病编码
                    getCureListByPK(colMap, "PK", "DE05_01_024_00_MZZD",tableName,"1");
                    if(StringUtils.isBlank(colMap.get("DE05_01_024_00_MZZD") == null ? "" : colMap.get("DE05_01_024_00_MZZD").toString())){
                        getCureListByPK(colMap, "PK", "DE05_01_024_00_MZZD",tableName);
                    }
                    //病理诊断-疾病编码
                    getCureListByPK(colMap, "PK", "DE05_01_024_00_BLZD",tableName,"10");
                    if(StringUtils.isBlank(colMap.get("DE05_01_024_00_BLZD") == null ? "" : colMap.get("DE05_01_024_00_BLZD").toString())){
                        getCureListByPK(colMap, "PK", "DE05_01_024_00_BLZD",tableName);
                    }
                    //出院诊断-主要诊断名称
                    getCureListByPK(colMap, "PK", "DE05_01_024_00_CYZZD",tableName,"4");
                    log.debug("出院诊断-主要诊断名称1:{}",colMap.get("DE05_01_024_00_CYZZD"));
                    if(StringUtils.isBlank(colMap.get("DE05_01_024_00_CYZZD") == null ? "" : colMap.get("DE05_01_024_00_CYZZD").toString())){
                        getCureListByPK(colMap, "PK", "DE05_01_024_00_CYZZD",tableName);
                        log.debug("出院诊断-主要诊断名称2:{}",colMap.get("DE05_01_024_00_CYZZD"));
                    }
                    //出院诊断-其他诊断名称
                    getCureListByPK(colMap, "PK", "DE05_01_024_00_CYCZD",tableName,"5");
                    log.debug("出院诊断-其他诊断名称1:{}",colMap.get("DE05_01_024_00_CYZZD"));
                    if(StringUtils.isBlank(colMap.get("DE05_01_024_00_CYCZD") == null ? "" : colMap.get("DE05_01_024_00_CYCZD").toString())){
                        getCureListByPK(colMap, "PK", "DE05_01_024_00_CYCZD",tableName);
                        log.debug("出院诊断-其他诊断名称2:{}",colMap.get("DE05_01_024_00_CYZZD"));
                    }
                    //出院诊断-其他诊断名称
                    getCureListByPK(colMap, "PK", "DE05_01_024_00_SSZD",tableName,"15");
                    if(StringUtils.isBlank(colMap.get("DE05_01_024_00_SSZD") == null ? "" : colMap.get("DE05_01_024_00_SSZD").toString())){
                        getCureListByPK(colMap, "PK", "DE05_01_024_00_SSZD",tableName);
                    }
                    //入诊断-主要诊断名称
                    zdSql="select * from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and TABLE_NAME='"+tableName+"' and DE05_01_024_00_TYPE='2'";
                    List<Map<String, Object>> ryzd = jdbcTemplate.queryForList(zdSql);
                    if(ryzd!=null && ryzd.size()>0){
                        colMap.put("DE09_00_104_00","1");
                        colMap.put("DE09_00_104_00","有");
                    }else{
                        colMap.put("DE09_00_104_00","4");
                        colMap.put("DE09_00_104_00","无");
                    }
                    getCureListByPK(colMap, "PK", "DE05_01_024_00_CYZZD",tableName,"2");
                    if(StringUtils.isBlank(colMap.get("DE05_01_024_00_CYZZD") == null ? "" : colMap.get("DE05_01_024_00_CYZZD").toString())){
                        getCureListByPK(colMap, "PK", "DE05_01_024_00_CYZZD",tableName);
                    }
                    //手术信息
                    ssSql="select * from HDSD00_11_SS WHERE pk='"+colMap.get("PK")+"'";
                    List<Map<String,Object>> sslList = jdbcTemplate.queryForList(ssSql);
                    colMap.put("DE06_00_255_00",sslList);
                    break;
                case "HDSD00_14_09" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_09_DE05_01_024_00",xyzdyy);
                    //获取目前诊断信息
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('mqzd')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_09_DE05_01_024_00_MQZD",xyzdyy);
                    break;
                case "HDSD00_14_05" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_05_DE05_01_024_00",xyzdyy);
                    //获取目前诊断信息
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('mqzd')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_05_DE05_01_024_00_MQZD",xyzdyy);
                    break;
                case "HDSD00_14_01" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_01_DE05_01_024_00",xyzdyy);
                    break;
                case "HDSD00_14_03" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_03_DE05_01_024_00",xyzdyy);
                    Sql="select * from HDSD00_05_01_JYXM WHERE pk='"+colMap.get("PK")+"'";
                    jybgList = jdbcTemplate.queryForList(Sql);
                    colMap.put("HDSD00_14_03_DE04_30_015_00",jybgList);
                    Sql="select * from HDSD00_SS WHERE pk='"+colMap.get("PK")+"'";
                    jybgList = jdbcTemplate.queryForList(Sql);
                    colMap.put("HDSD00_14_03_DE06_00_093_00",jybgList);
                    break;
                case "HDSD00_14_02" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_02_DE05_01_024_00",xyzdyy);
                    break;
                case "HDSD00_14_12" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_12_DE05_01_024_00",xyzdyy);
                    break;
                case "HDSD00_14_04" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_04_DE05_01_024_00",xyzdyy);
                    break;
                case "HDSD00_10_02" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_10_02_DE05_01_024_00",xyzdyy);
                    Sql="select * from HDSD00_SS WHERE pk='"+colMap.get("PK")+"'";
                    jybgList = handleSpecialCharacter(Sql);
                    colMap.put("HDSD00_10_02_DE06_00_093_00",jybgList);
                    break;
                case "HDSD00_09_03" :
                    //诊断-疾病编码
                    getCureListByPK(colMap, "PK", "DE05_01_024_00", tableName);
                    //护理操作项目
                    czxmSql="select * from HDSD00_08_XM WHERE pk='"+colMap.get("PK")+"' and DE06_00_342_00_TYPE='2' and TABLE_NAME='"+tableName+"'";
                    czxlList = jdbcTemplate.queryForList(czxmSql);
                    if(null!= czxlList && czxlList.size()<=0){
                        Map<String,Object> czxmap = new HashMap<String,Object>();
                        czxmap.put("PK",colMap.get("PK"));
                        czxmap.put("DE06_00_209_00","-");
                        czxmap.put("DE06_00_342_00","-");
                        czxmap.put("DE06_00_210_00","-");
                        czxlList.add(czxmap);
                    }
                    colMap.put("DE06_00_210_00",czxlList);
                    break;
                case "HDSD00_09_02" :
                    //诊断-疾病编码
                    getCureListByPK(colMap, "PK", "DE05_01_024_00", tableName);
                    break;
                case "HDSD00_10_06" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_10_06_DE05_01_024_00",xyzdyy);
                    break;
                case "HDSD00_10_01" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_10_01_DE05_01_024_00",xyzdyy);
                    break;
                case "HDSD00_14_14" :
                    //获取入院诊断信息 temp
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null  and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_14_14_DE05_01_024_00",xyzdyy);
                    break;
                case "HDSD00_07_03" :
                    medsSql="select * from HDSD00_06_COM_YY WHERE pk='"+colMap.get("pk")+"' and SHENGCHAN='产时用药'";
                    medsList = jdbcTemplate.queryForList(medsSql);
                    if(null!= medsList && medsList.size()<=0){
                        Map<String,Object> yymap = new HashMap<String,Object>();
                        yymap.put("PK",colMap.get("PK"));
                        yymap.put("DE06_00_134_00","9");
                        yymap.put("DE06_00_134_00_NAME","其他用药途径");
                        yymap.put("DE06_00_135_00","0.00");
                        yymap.put("DE08_50_023_00","99");
                        yymap.put("DE06_00_133_00","其它");
                        yymap.put("DE08_50_022_00","-");
                        yymap.put("DE08_50_024_00","mg");
                        medsList.add(yymap);
                    }
                    colMap.put("DE08_50_022_00_CHANSHI",medsList);
                    medsSql="select * from HDSD00_06_COM_YY WHERE pk='"+colMap.get("pk")+"' and SHENGCHAN='产后用药'";
                    medsList = jdbcTemplate.queryForList(medsSql);
                    if(null!= medsList && medsList.size()<=0){
                        Map<String,Object> yymap = new HashMap<String,Object>();
                        yymap.put("PK",colMap.get("PK"));
                        yymap.put("DE06_00_134_00","9");
                        yymap.put("DE06_00_134_00_NAME","其他用药途径");
                        yymap.put("DE06_00_135_00","0.00");
                        yymap.put("DE08_50_023_00","99");
                        yymap.put("DE06_00_133_00","其它");
                        yymap.put("DE08_50_022_00","-");
                        yymap.put("DE08_50_024_00","mg");
                        medsList.add(yymap);
                    }
                    colMap.put("DE08_50_022_00_CHANHOU",medsList);
                    zdSql=" select distinct DE05_01_024_00_NAME,DE05_01_024_00 from HDSD00_ZD WHERE pk='"+colMap.get("PK")+"' and DE05_01_024_00 is not null and DE05_01_024_00_TYPE in ('1','3','2')";
                    xyzdyy = handleSpecialCharacter(zdSql);
                    colMap.put("HDSD00_07_03_DE05_01_024_00",xyzdyy);
                    break;
            }
        }catch (Exception e){
            log.error("报错："+e);
        }

    }


    /**
     * 将不为空的字段加上默认值
     * @param colMap
     * @param listStr
     * @param listInt
     */
    public void validateNotNullClomn(Map<String,Object> colMap,List<String> listStr,List<String> listInt){
        if(null != listStr){
            for (String clo : listStr){
                if(colMap.containsKey(clo)){
                    if(null == colMap.get(clo)){
                        colMap.put(clo,"-");
                    }
                }
            }
        }
        if(null != listInt){
            for (String clo : listInt){
                if(colMap.containsKey(clo)){
                    if(null == colMap.get(clo)){
                        colMap.put(clo,"0");
                    }
                }
            }
        }
    }


    public void paseSmtz(Map<String,Object> colMap,String smtz){
        String xinlv="00";//心率
        String maibo="00";//脉搏
        String sousy="00";//有创动脉收缩压
        String shuzy="00";//有创动脉舒张压
        String huxi="00";//呼吸
        String tiwen="00.0";//体温
        String[] smtzspli = smtz.split("@");
        log.debug("体位1：{}",tiwen);
        if(smtzspli.length==2){
            String tzxmmc = smtzspli[0];//18-08-24 14:35=152.0,69.0,100.0,78.0,77.0,
            String tzxmval = smtzspli[1];
            String[] mcsplit = tzxmmc.substring(tzxmmc.indexOf("=")).split(",");
            String[] valsplit = tzxmval.substring(tzxmval.indexOf("=")).split(",");
            if(mcsplit.length == valsplit.length){
                if(getIndex(mcsplit,"40")>=0){
                    xinlv=valsplit[getIndex(mcsplit,"40")];//心率
                }
                if(getIndex(mcsplit,"44")>=0){
                    maibo=valsplit[getIndex(mcsplit,"44")];//脉搏
                }
                if(getIndex(mcsplit,"49")>=0){
                    sousy=valsplit[getIndex(mcsplit,"49")];//有创动脉收缩压
                }
                if(getIndex(mcsplit,"50")>=0){
                    shuzy=valsplit[getIndex(mcsplit,"50")];//有创动脉舒张压
                }
                if(getIndex(mcsplit,"92")>=0){
                    huxi=valsplit[getIndex(mcsplit,"92")];//呼吸
                }
                if(getIndex(mcsplit,"100")>=0){
                    tiwen=valsplit[getIndex(mcsplit,"100")];//体温
                    if(StringUtils.isNotBlank(tiwen)&&!tiwen.contains(".")){
                        tiwen=tiwen+".0";
                    }
                }
            }
        }
        colMap.put("DE04_10_206_00",StringUtils.isNotBlank(xinlv)?xinlv:"00");
        colMap.put("DE04_10_118_00",StringUtils.isNotBlank(maibo)?maibo:"00");
        colMap.put("DE04_10_174_00",StringUtils.isNotBlank(sousy)?sousy:"00");
        colMap.put("DE04_10_176_00",StringUtils.isNotBlank(shuzy)?shuzy:"00");
        colMap.put("DE04_10_081_00",StringUtils.isNotBlank(huxi)?huxi:"00");
        colMap.put("DE04_10_186_00",StringUtils.isNotBlank(tiwen)?tiwen:"00.0");
        log.debug("体位3：{}",colMap.get("DE04_10_186_00"));
    }



    public static int getIndex(String str[],String value){
        int index=-1;
        for (int i = 0; i < str.length; i++) {
            if(value.equals(str[i].trim())){
                index = i;
            }
        }
        return index;
    }

    /**
     * 根据pk值获取诊断列表
     * @param colMap
     * @param illLink 诊断疾病关联主建字段
     * @param illContext 诊断疾病信息存储字段
     */
    public void getCureListByPK(Map<String,Object> colMap,String illLink,String illContext,String tableName){
        getCureListByPK(colMap,illLink,illContext,tableName,null);
    }


    /**
     * 根据pk值和诊断类型获取诊断列表
     * @param colMap
     * @param illLink 诊断疾病关联主建字段
     * @param illContext 诊断疾病信息存储字段
     * @param type 诊断类型
    */
    public void getCureListByPK(Map<String,Object> colMap,String illLink,String illContext,String tableName,String type){
        String zdSql="select * from HDSD00_ZD WHERE pk='"+colMap.get(illLink)+"' and TABLE_NAME='"+tableName+"'";
        if(StringUtils.isNotBlank(type)){
            zdSql+=" and DE05_01_024_00_TYPE='"+type+"'";
        }
        List<Map<String, Object>> xyzdyy = jdbcTemplate.queryForList(zdSql);
        List<Map<String, Object>> newList = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < xyzdyy.size(); i++) {
            Map<String, Object> stringObjectMap = xyzdyy.get(i);
            stringObjectMap.put("DE05_01_024_00",stringObjectMap.get("DE05_01_024_00")==null?null:stringObjectMap.get("DE05_01_024_00").toString().replace("？","†"));
            stringObjectMap.put("DE05_01_024_00_NAME",stringObjectMap.get("DE05_01_024_00_NAME")==null?null:stringObjectMap.get("DE05_01_024_00_NAME").toString().replace("？","†"));
            newList.add(stringObjectMap);
        }
        colMap.put(illContext,newList);
    }

    /**
     * 解决† oracle无法识别
     * @param xyzdyy
     */
    public List<Map<String, Object>> validateList(List<Map<String, Object>> xyzdyy){
        List<Map<String, Object>> newList = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < xyzdyy.size(); i++) {
            Map<String, Object> stringObjectMap = xyzdyy.get(i);
            stringObjectMap.put("DE05_01_024_00",stringObjectMap.get("DE05_01_024_00")==null?null:stringObjectMap.get("DE05_01_024_00").toString().replace("？","†"));
            stringObjectMap.put("DE05_01_024_00_NAME",stringObjectMap.get("DE05_01_024_00_NAME")==null?null:stringObjectMap.get("DE05_01_024_00_NAME").toString().replace("？","†"));
            newList.add(stringObjectMap);
        }
        return newList;
    }

    /**
     * 解决† oracle无法识别
     */
    public List<Map<String, Object>> handleSpecialCharacter( String zdSql){
        List<Map<String, Object>> xyzdyy = jdbcTemplate.queryForList(zdSql);
        List<Map<String, Object>> newList = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < xyzdyy.size(); i++) {
            Map<String, Object> stringObjectMap = xyzdyy.get(i);
            stringObjectMap.put("DE05_01_024_00",stringObjectMap.get("DE05_01_024_00")==null?null:stringObjectMap.get("DE05_01_024_00").toString().replace("？","†"));
            stringObjectMap.put("DE05_01_024_00_NAME",stringObjectMap.get("DE05_01_024_00_NAME")==null?null:stringObjectMap.get("DE05_01_024_00_NAME").toString().replace("？","†"));
            stringObjectMap.put("QZRQ",stringObjectMap.get("QZRQ")==null?null:stringObjectMap.get("QZRQ"));
            newList.add(stringObjectMap);
        }
        return newList ;
    }
    private String docNameConvert(String tableName) {
        switch (tableName) {
            case "HDSD00_02_02" : return "-01-病历概要-";
            case "HDSD00_03_02" : return "-02-门（急）诊病历-";
            case "HDSD00_03_01" : return "-03-急诊留观病历-";
            case "HDSD00_04_01" : return "-04-西药处方-";
            case "HDSD00_04_02" : return "-05-中药处方-";
            case "HDSD00_05_02" : return "-06-检查报告-";
            case "HDSD00_05_01" : return "-07-检验报告-";
            case "HDSD00_06_03" : return "-08-治疗记录-";
            case "HDSD00_06_06" : return "-09-一般手术记录-";
            case "HDSD00_06_05" : return "-10-麻醉术前访视记录-";
            case "HDSD00_06_04" : return "-11-麻醉记录-";
            case "HDSD00_06_02" : return "-12-麻醉术后访视记录-";
            case "HDSD00_06_01" : return "-13-输血记录-";
            case "HDSD00_07_02" : return "-14-待产记录-";
            case "HDSD00_07_03" : return "-15-阴道分娩记录-";
            case "HDSD00_07_01" : return "-16-剖宫产记录-";
            case "HDSD00_08_06" : return "-17-一般护理记录-";
            case "HDSD00_08_01" : return "-18-病重（病危）护理记录-";
            case "HDSD00_08_05" : return "-19-手术护理记录-";
            case "HDSD00_08_03" : return "-20-生命体征测量记录-";
            case "HDSD00_08_04" : return "-21-出入量记录-";
            case "HDSD00_08_02" : return "-22-高值耗材使用记录-";
            case "HDSD00_09_01" : return "-23-入院评估-";
            case "HDSD00_09_03" : return "-24-护理计划-";
            case "HDSD00_09_02" : return "-25-出院评估与指导-";
            case "HDSD00_10_02" : return "-26-手术知情同意书-";
            case "HDSD00_10_04" : return "-27-麻醉知情同意书-";
            case "HDSD00_10_05" : return "-28-输血治疗同意书-";
            case "HDSD00_10_03" : return "-29-特殊检查及特殊治疗同意书-";
            case "HDSD00_10_06" : return "-30-病危（重）通知书-";
            case "HDSD00_10_01" : return "-31-其他知情告知同意书-";
            case "HDSD00_11_01" : return "-32-住院病案首页-";
            case "HDSD00_12_01" : return "-33-中医住院病案首页-";
            case "HDSD00_13_02" : return "-34-入院记录-";
            case "HDSD00_13_01" : return "-35-24小时内入出院记录-";
            case "HDSD00_13_03" : return "-36-24小时内入院死亡记录-";
            case "HDSD00_14_14" : return "-37-首次病程记录-";
            case "HDSD00_14_08" : return "-38-日常病程记录-";
            case "HDSD00_14_15" : return "-39-上级医师查房记录-";
            case "HDSD00_14_10" : return "-40-疑难病例讨论记录-";
            case "HDSD00_14_09" : return "-41-交接班记录-";
            case "HDSD00_14_05" : return "-42-转科记录-";
            case "HDSD00_14_01" : return "-43-阶段小结-";
            case "HDSD00_14_03" : return "-44-抢救记录-";
            case "HDSD00_14_02" : return "-45-会诊记录-";
            case "HDSD00_14_04" : return "-46-术前小结-";
            case "HDSD00_14_12" : return "-47-术前讨论-";
            case "HDSD00_14_06" : return "-48-术后首次病程记录-";
            case "HDSD00_14_11" : return "-49-出院记录-";
            case "HDSD00_14_16" : return "-50-死亡记录-";
            case "HDSD00_14_07" : return "-51-死亡病例讨论记录-";
            case "HDSD00_15_01" : return "-52-住院医嘱-";
            case "HDSD00_16_01" : return "-53-出院小结-";
            default: return "-00-unknow-";
        }
    }

    public synchronized double getCount( List<Map<String, Object>> xyzdyy ){
        Double count = 0.00;
        for (Map<String, Object> map : xyzdyy) {
            Double mon = 0.00;
            Object money = map .get("DE07_00_004_00");
            if(null != money && StringUtils.isNotBlank(money.toString())){
                mon = Double.parseDouble(money.toString());
            }
            count += mon;
        }
        return  new BigDecimal(count).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    class Thread2 implements Runnable{
        private String tableName;
        public Thread2(String tableName ) {
            this.tableName=tableName;
        }
        @Override
        public void run() {
                while (true){
                    try {
                        String queSql = "select DSMT from TABLE_DSMT where TABLE_NAME='"+tableName+"'";
                        List<Map<String, Object>> pathMap = jdbcTemplate.queryForList(queSql);
                        if((pathMap.get(0).get("DSMT")+"").equals("1")){
                            initCDAData(tableName);
                        }
                    } catch (Exception e) {
                        log.error(tableName+":"+e);
                    }
                }
        }
    }

}
