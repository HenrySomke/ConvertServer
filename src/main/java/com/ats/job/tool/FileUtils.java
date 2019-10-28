package com.ats.job.tool;

import com.jayway.jsonpath.ReadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by fangbangben on 2018/8/30.
 */
public class FileUtils {

    private static final Logger log = LoggerFactory.getLogger(FileUtils.class);

    /*
    *根据json文件，读取json内容返回
    */
    public static String readFileByLines(String filePath) {
        //File file = new File(fileName);
        InputStream is = null;
        String str = "";
        try {
            is = FileUtils.class.getClassLoader().getResourceAsStream(filePath);
            byte[] byt = new byte[is.available()];
            is.read(byt);
            str = new String(byt,"UTF-8");

            log.debug("文件读取成功！文件名称："+filePath);
        } catch (IOException e) {
            log.error("文件读取IO异常！文件名称："+filePath+"!\n\n报错信息："+e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e1) {
                    log.error("reader 关闭异常："+e1);
                }
            }
        }
        return str;
    }

    /*
    * 根据json节点获取对应值
    * */
    public static Object getNode(ReadContext context,String jsonNode){
        Object read = null;
        try {
            read = context.read(jsonNode);
        }catch (Exception e){
            if(e.toString().contains("No results for path")){
//                log.debug("json内容："+context+"\n\n不存在节点：" + jsonNode);
                return null;
            }else{
                log.error("解析json:" + context + "!报错：" + e);
                return null;
            }
        }
//        log.debug("json内容："+context+"\n\n解析节点：" + jsonNode+"解析结果："+read);
        return read;
    }
}