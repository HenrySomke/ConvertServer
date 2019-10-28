package com.ats.job.server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.spi.http.HttpExchange;
import java.io.*;
import java.net.InetSocketAddress;

/**
 * Created by fangbangben on 2018/8/29.
 */
//@WebService
public class CDAWebService extends Thread {
    private static final Logger log = LoggerFactory.getLogger(CDAWebService.class);

    @Resource
    private WebServiceContext wsContext;

    public String getCDA(String docType,String userName){
        String docPath="D:/CDA_DP/"+docType+"/" + userName;
        File docFile = new File(docPath);
        String docStr = "";
        String[] docList=new String[10];
        FileInputStream fis=null;
        InputStreamReader reader = null;
        BufferedReader br = null;
        try {
            if(docFile.exists()){
                docList = docFile.list();
            }
            if(docList.length<=0){
                docStr = "未找到相应文档！";
            }else{
                for (int i=0;i<docList.length;i++){
                    String tempPath = docPath+"/"+docList[i];
                    fis = new FileInputStream(new File(tempPath));
                    reader = new InputStreamReader(fis,"UTF-8"); //最后的"GBK"根据文件属性而定，如果不行，改成"UTF-8"试试
                    br = new BufferedReader(reader);
                    String line;
                    StringBuilder sbu = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        sbu.append(line);
                    }
                    docStr = sbu.toString();
                    br.close();
                    reader.close();
                    fis.close();
                    System.out.println(docStr);
                }
            }
           // log.debug("接收来自客户端地址:"+getClientInfo()+"\n\n"+"接收参数为：{docType="+docType+",userName="+userName+"}\n\n"+"返回参数："+docStr);
        }catch(Exception e){
           // log.error("接收来自客户端地址:"+getClientInfo().getAddress()+"\n\n"+"接收参数为：{docType="+docType+",userName="+userName+"}\n\n"+"返回参数："+docStr+"\n\n报错信息："+e);
            return "获取出错！";
        }finally {
            try {
                if(null != br) {
                    br.close();
                }
                if(null != reader){
                    reader.close();
                }
                if(null != fis){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return docStr;
    }

//    private InetSocketAddress getClientInfo() {
//        InetSocketAddress isa = null;
//        try {
//            MessageContext mc = wsContext.getMessageContext();
//
//            HttpExchange exchange = (HttpExchange) mc.get(JAXWSProperties.HTTP_EXCHANGE);
//            isa = exchange.getRemoteAddress();
//            System.out.println("InetSocketAddress : " + isa);
//            System.out.println("Hostname : "
//                    + isa.getAddress().getHostAddress() + " address: "
//                    + isa.getAddress().getHostName());
//        } catch (Exception e) {
//            log.error("获取客户端地址报错："+e);
//        }
//        return isa;
//    }
    public void run() {
        //Endpoint.publish("http://127.0.0.1:8087/Service/ConverServer", new CDAWebService());
    }
}
