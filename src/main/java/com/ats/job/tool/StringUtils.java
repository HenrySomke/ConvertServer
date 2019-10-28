package com.ats.job.tool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auth Huangzhiyan
 * @since 2018-06-06 14:48
 */
public class StringUtils extends org.apache.commons.lang.StringUtils{
    private static Logger log = LoggerFactory.getLogger(StringUtils.class);
    public static String isValue(Object value) {
        if (value == null || "null".equals(value.toString().trim()) || "".equals(value.toString().trim())) {
            return "";
        } else {
            return value.toString().trim();
        }
    }

    //截取数字  【读取字符串中第一个连续的字符串，不包含后面不连续的数字】
    public static String getNumbers(String content) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }

    public static String formatNormalDate(Object dateTime){
        if(null == dateTime){
            log.debug("formatNormalDate param dateTime is null");
            return "";
        }
        String tempDate = "";
        try{
            Date date = new Date(dateTime.toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            tempDate = sdf.format(date);
        }catch (Exception e){
            log.debug("format date:"+dateTime.toString()+"Exception:"+e);
            return "";
        }
        return tempDate;
    }

    //不规则日期格式化
    public static String formatIrrDateTime(Object dateTime){
        if(null == dateTime){
            return null;
        }
        String replace = dateTime.toString().replace("-", "").replace(" ", "").replace(":","")
                .replace("年","").replace("月","").replace("日","").replace("时","").replace("分","").replace("秒","");
        return replace;
    }
}
