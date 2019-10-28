package com.ats.job.test;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class CheckTheSame {

    /**
     * 分词
     * @author: administrator
     * @Date: 2016年3月5日15:10:47
     * @param str
     * @return
     */
    public static Vector<String> participle( String str ) {

        Vector<String> str1 = new Vector<String>() ;//对输入进行分词

        try {

            StringReader reader = new StringReader( str );
            IKSegmenter ik = new IKSegmenter(reader,false);//当为true时，分词器进行智能切分
            Lexeme lexeme = null ;

            while( ( lexeme = ik.next() ) != null ) {
                str1.add( lexeme.getLexemeText() );
            }

            if( str1.size() == 0 ) {
                return null ;
            }

            //分词后
            // System.out.println( "str分词后：" + str1 );

        } catch ( IOException e1 ) {
            //System.out.println();
        }
        return str1;
    }
    /**
     * 返回比较的两个字符串的相似度
     * @param strone
     * @param strtwo
     * @return
     */
    public String getSemblance(String strone,String strtwo) {
        String semblanceString = "0.0000";
        //分词
        Vector<String> strs1 = participle(strone) ;
        Vector<String> strs2 = participle(strtwo) ;
        //根据分词返回相似度
        double same = 0 ;
        try {
            same = IKAnalyzerUtil.getSimilarity(strs1, strs2);
        } catch (Exception e) {
            //System.out.println( e.getMessage() );
        }
        semblanceString=String.valueOf(same);
        //System.out.println( "相似度：" + same );
        return semblanceString;
    }
//    public static void main(String[] args) {
//
//        //分词
//        Vector<String> strs1 = participle( "身份证明" ) ;
//        Vector<String> strs2 = participle( "个人身份证明复印件" ) ;
//
//        //根据分词返回相似度
//        double same = 0 ;
//        try {
//            same = IKAnalyzerUtil.getSimilarity( strs1 , strs2 );
//        } catch (Exception e) {
//            System.out.println( e.getMessage() );
//        }
//
//        System.out.println( "相似度：" + same );
//    }

    public static void main(String[] args) {
        Connection connection=getConnection();
        Statement stm=null;
        ResultSet rs=null;
        Map<String,Object> icdmap = new HashMap<>();
        Map<String,Object> gjmap = new HashMap<>();
        try {
            stm= connection.createStatement();
            String icdsql="select * From BA_ICDDM_BZ where JBMC is not null and JBMC_BZ is null";
            String gjsql="select *from GUOJIAZD";
            rs=stm.executeQuery(icdsql);
            while(rs.next()){
                icdmap.put(rs.getString(1),rs.getString(2));
            }

            rs=stm.executeQuery(gjsql);
            while(rs.next()){
                gjmap.put(rs.getString(2),rs.getString(3));
            }
            int cont=0;

            for (String key:icdmap.keySet()){
                String icdstr = icdmap.get(key).toString();
                icdstr =icdstr.replace("*", "").replace("(", "").replace(")", "").replaceAll("<", "").replaceAll(">","").replace(".","");

                for(String gjkey:gjmap.keySet()){
                    String gjstr = gjmap.get(gjkey).toString();
                    String gjstr2 = gjstr.replace("*", "").replace("(", "").replace(")", "").replaceAll("<", "").replaceAll(">","").replace(".", "");
                    Vector<String> strs1 = participle(icdstr) ;
                    Vector<String> strs2 = participle(gjstr2) ;
                    double similarity = IKAnalyzerUtil.getSimilarity(strs1, strs2);
                    if(similarity==1){
                        String inssql = "update BA_ICDDM_BZ set JBMC_BZ = '"+gjstr+"',ICD10_BZ='"+gjkey+"',right_level='1' where JBXH='"+key+"'";
                        int i = stm.executeUpdate(inssql);
                        System.out.println("插入第"+cont+++"条");
                        break;
                    }
                }
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            release(connection, stm, rs);
        }

    }


    public static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");       //加载数据库驱动
            String url= "jdbc:oracle:thin:@172.20.2.205:1521/hiup";      //连接URL
            String username = "hlht_gate";
            String password = "Jdey_2017";
            connection=DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void release(Connection con, Statement statement,ResultSet rs){
        if(null!=rs){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                rs=null;
            }
            if(null!=statement){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }finally{
                    statement=null;
                }
            }
            if(null!=con){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }finally{
                    con=null;
                }
            }
        }

    }
}