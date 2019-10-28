package com.ats.job.jsonpath;

import com.ats.job.tool.FileUtils;
import com.ats.job.tool.StringUtils;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
/**
 * Created by fangbangben on 2018/8/30.
 */
public abstract class BaseJsonPath {
    private static final Logger log = LoggerFactory.getLogger(BaseJsonPath.class);
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    /**
    *@Description: 解析json数据，并插入数据库
    *@Param: json
    *@Return:
    *@Author:bangben.fang
    *@Date:2018/10/18
    */
    public void ParseJson(String json) {
        try{
//            String json = FileUtils.readFileByLines(getJsonPath());
            ReadContext context = JsonPath.parse(json);
            insertData(getMap(), getTableName(), context);
        }catch (Exception e){
            log.error("json:"+json+"\n\n类型："+getTableName()+" ,解析异常："+e);
            return;
        }
        log.debug("类型："+getTableName()+" ，插入数据成功");
    }

    /**
    *@Description:解析的数据插入数据库
    *@Param:map 插入字段信息key字段，value值
    *@Param:tableName 表名
    *@Param:context json解析对象
    *@Return:void
    *@Author:bangben.fang
    *@Date:2018/10/18
    */
    public void insertData(Map<String,Object> map,String tableName,ReadContext context) throws Exception{
            String sql = "insert into "+tableName;
            StringBuffer keyStr = new StringBuffer();
            StringBuffer valueStr = new StringBuffer();
            for (Map.Entry<String,Object> entry : map.entrySet()) {
                //value 中包含"$."对应的是json字段值，不包含的为固定值
                Object tempVal = entry.getValue().toString().contains("$.")?FileUtils.getNode(context, (String)entry.getValue()):entry.getValue();
                tempVal = validateValue(tempVal,entry.getKey());
                keyStr.append(entry.getKey()+",");
                valueStr.append("'" + tempVal + "',");
            }
            //删除最后一个逗号
            keyStr.deleteCharAt(keyStr.length()-1);
            valueStr.deleteCharAt(valueStr.length()-1);
            sql+="("+keyStr.toString()+") values("+valueStr.toString()+")";
            jdbcTemplate.execute(sql);
    }

    /**
    *@Description:验证字段值的正确性
    *@Param:tempVal 值
    *@Param:tempKey
    *@Return:Object
    *@Author:bangben.fang
    *@Date:2018/10/18
    */
    public Object validateValue(Object tempVal,String tempKey){
        if("DE02_01_032_00".equals(tempKey) || "DE02_01_026_00".equals(tempKey)){  //年龄字段值不合格做设置为null
            if(null != tempVal && !(tempVal.toString().matches("(([0-9]|[1-9][1-9]|1[0-7][0-9])(\\.[0-9]+)?|180)"))){
                tempVal = StringUtils.getNumbers(tempVal.toString());
            }
            if(null != tempVal && !(tempVal.toString().matches("(([0-9]|[1-9][1-9]|1[0-7][0-9])(\\.[0-9]+)?|180)"))){
                tempVal = null;
            }
        }
        if("DE02_01_040_00".equals(tempKey)){ //处理性别固定字符"女性":"男性"
            if(null==tempVal){
                tempVal = "男性";
            }else{
                tempVal = (tempVal.toString().contains("女") || tempVal.toString().contains("2"))?"女性":"男性";
            }
        }

        //固定时间格式
        if(null != tempVal && "$.messageText.emrRecord.recTime".equals(tempKey)){
            try{
                Date date = new Date(tempVal.toString());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                tempVal = sdf.format(date);
            }catch (Exception e){
                tempVal = "";
            }
        }
//                if(true){//时间字段设置格式yyyymmddhhmmss
//
//                }
        //设置字段最大长度不超过999
        if(null != tempVal && tempVal.toString().length()>999){
            tempVal = tempVal.toString().substring(0,998);
        }
        return tempVal;
    }

    public static String formatDate(String dateStr){
        String format = "";
        try{
            if(dateStr.contains("年")||dateStr.contains("月")){
                SimpleDateFormat sdfch =  new SimpleDateFormat("yyyyMMMddHHmmss", Locale.CHINA);
                Date parse = sdfch.parse(dateStr);
                System.out.println(parse);
            }else{
//                long lt = new Long(dateStr);
            Date date = new Date(dateStr);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String format1 = sdf.format(date);
            System.out.println(format1);
                Date parse = sdf.parse(dateStr);
                format = sdf.format(parse);
                System.out.println(parse+"--"+format);
            }
        }catch (Exception e){
            e.printStackTrace();
            dateStr.replace("年","");
        }
        return format;
    }

    public static void main(String[] args) {
//        String s = BaseJsonPath.formatDate("Apr 29, 2013 12:18:03 PM");
        String tempVal = "100";
        boolean test = tempVal.matches("(([0-9]|[1-9][1-9]|1[0-7][0-9])(\\.[0-9]+)?|180)");
        System.out.println(test);
    }
    public abstract Map<String,Object> getMap();
    public abstract String getJsonPath();
    public abstract String getTableName();
}