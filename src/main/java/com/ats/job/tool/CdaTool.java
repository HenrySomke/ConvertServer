package com.ats.job.tool;

import org.apache.commons.lang.time.DateUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by 周灏 on 2015/9/19.
 */
public class CdaTool {
    private static final Logger log = LoggerFactory.getLogger(CdaTool.class);
    public static Document loadXml(String url){
        Document document = null;
        Namespace ns = null;
        try {
            SAXReader reader = new SAXReader();

            FileInputStream fis = new FileInputStream(url);
            if (fis.available() == 0) {

                ns = null;
            } else {
                document = reader.read(fis);
                Element root = document.getRootElement();
                ns = root.getNamespace();
            }

            if (ns != null) {
                String content = document.asXML();
                content = content.replaceFirst("xmlns", "xml");
                document = DocumentHelper.parseText(content);
            } else {
                return document;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return document;
    }

    /**
     * 获取文件存放路径
     * @param repositoryRoot
     * @param id
     * @return
     */
    public static String getRepositoryItemPath(String repositoryRoot, String id) {
        // 计算本日路径
        Date dateNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd/HH");
        String dirRoot = repositoryRoot + dateFormat.format(dateNow);

        // 创建路径
        File file = new File(dirRoot);
        if (!file.exists())
            file.mkdirs();
        String repositoryItemPath = dirRoot + "/" + id ;
        return repositoryItemPath;
    }

    /**
     * 日期格式化输出
     * @param date
     * @return
     */
    public static String formatDate(Date date){
        try {
            return new SimpleDateFormat("yyyyMMddHHmmss").format(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 日期格式化输出（DATE格式）
     * @param str
     * @return
     */
    public static Date dateFormatString(String str){
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
            return sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static String getTimeClo(String tableName){
        switch (tableName){
            case "HDSD00_04_01":
                return "DE08_50_033_00";
            case "HDSD00_04_02":
                return "DE08_50_033_00";
            case "HDSD00_05_01":
                return "DE04_50_133_00";
            case "HDSD00_05_02":
                return "DE04_50_133_00";
            case "HDSD00_06_02":
                return "CONTRAST_TIME";
            case "HDSD00_06_04":
                return "CONTRAST_TIME";
            case "HDSD00_06_05":
                return "CONTRAST_TIME";
            case "HDSD00_08_01":
                return "DE09_00_053_00";
            case "HDSD00_08_02":
                return "DE09_00_053_00_QMRQ";
            case "HDSD00_08_03":
                return "DE09_00_053_00";
            case "HDSD00_08_04":
                return "DE09_00_053_00_QMRQ";
            case "HDSD00_08_05":
                return "DE09_00_107_00";
            case "HDSD00_08_06":
                return "DE09_00_053_00";
            case "HDSD00_09_01":
                return "DE09_00_053_00";
            case "HDSD00_09_02":
                return "CONTRAST_TIME";
            case "HDSD00_09_03":
                return "CONTRAST_TIME";
            case "HDSD00_15_01":
                return "DE06_00_220_00";
            default:
                return "";
        }
    }


    /**
     * 获取5分钟前的时间
     * @return
     */
    public static String getTimeBefore(Calendar nowTime){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
//        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE, -5);
        return sdf.format(nowTime.getTime());
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
        Date parse=null;
        try {
            parse = sdf.parse("2019-01-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date = DateUtils.addDays(parse, 1);
        //Date date = new Date();
        System.out.println(date);

    }
    /**
     * 日期格式化输出(TIMESTAMP格式)
     * @param str
     * @return
     */
    public static Timestamp tsFormatString(String str){
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHMMss");
            SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
            return Timestamp.valueOf(sdf1.format(sdf.parse(str)));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 通过时间秒毫秒数判断两个时间的间隔
     * @param day1
     * @param day2
     * @return
     */
    public static int differentDaysByMillisecond(String day1,String day2)
    {
        if(StringUtils.isBlank(day1)  ||  StringUtils.isBlank(day2) ){
            return 0;
        }
        DateFormat format1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = null;
        Date date2 = null;
        // String转Date
        try {
            date1 = format1.parse(day1);
            date2 = format1.parse(day2);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
        int days = (int)((date2.getTime() - date1.getTime()) / (1000*3600*24)) ;
        return days;
    }



}
