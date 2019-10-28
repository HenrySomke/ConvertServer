package json.path.test;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import net.minidev.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangmei on 2018/8/20.
 */
public class JsonPathTest {

    public static void main(String[] args){
        Map<String,String> testJsonPathMapConf=new HashMap<>();
        testJsonPathMapConf.put("书点所有书的作者","$.store.book[*].author");
        testJsonPathMapConf.put("所有的作者","$..author");
        testJsonPathMapConf.put("store的所有元素。所有的bookst和bicycle","$.store.*");
        testJsonPathMapConf.put("store里面所有东西的price","$.store..price");
        testJsonPathMapConf.put("第三个书","$..book[2]");
        //$..book[0,1]或$..book[:2]
        testJsonPathMapConf.put("前面的两本书","$..book[:2]");
        testJsonPathMapConf.put("过滤出所有的包含isbn的书","$..book[?(@.isbn)]");
        testJsonPathMapConf.put("过滤出价格低于10的书","$..book[?(@.price<10)]");
        String testJson="{ \"store\": {\n" +
                "    \"book\": [ \n" +
                "      { \"category\": \"reference\",\n" +
                "        \"author\": \"Nigel Rees\",\n" +
                "        \"title\": \"Sayings of the Century\",\n" +
                "        \"price\": 8.95\n" +
                "      },\n" +
                "      { \"category\": \"fiction\",\n" +
                "        \"author\": \"Evelyn Waugh\",\n" +
                "        \"title\": \"Sword of Honour\",\n" +
                "        \"price\": 12.99\n" +
                "      }" +
                "    ],\n" +
                "    \"bicycle\": {\n" +
                "      \"color\": \"red\",\n" +
                "      \"price\": 19.95\n" +
                "    }\n" +
                "  }\n" +
                "}";
        if(!isJson(testJson)){
            System.out.println("内容并非JSON格式！！！");
            return ;
        }
        for(String key:testJsonPathMapConf.keySet()){
           System.out.println(key+"=\t"+read(testJson,testJsonPathMapConf.get(key)));
        }
    }

    /**
     * 判断json字符串格式是否正确
     * @param jsonString
     * @return
     */
    public static boolean isJson(String jsonString){
        try{
            JSONObject jsonObject = JSONObject.fromObject( jsonString );
            jsonObject=null;
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * 通过JsonPath从Json中获取内容
     * @param json
     * @param jsonPath
     * @return
     */
    public static String read(String json, String jsonPath) {
        if(null==json||null==jsonPath){
            return "";
        }
        try{
            Object jsonPathVal= JsonPath.read(json, jsonPath);
            if(jsonPathVal instanceof JSONArray){
                JSONArray jsonArray= (JSONArray) jsonPathVal;
                for(int i=0;i<jsonArray.size();i++){
                    System.out.println(jsonArray.get(i));
                }
            }
            if(!(jsonPathVal instanceof net.minidev.json.JSONObject)){
                return jsonPathVal+"";
            }
            return "";
        }catch (PathNotFoundException e){
            return "";
        }catch (Exception e){
            //如要记录日志，下面是临时处理
            e.printStackTrace();
            return "";
        }
    }


}
