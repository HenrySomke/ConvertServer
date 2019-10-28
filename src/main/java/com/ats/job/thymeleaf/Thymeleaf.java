package com.ats.job.thymeleaf;


import com.ahiup.io.imp.AHFileOutputStream;
import com.ats.job.server.CDACreateServer;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 
 * 
 * @author        jiangzhenjian  2016-5-28 下午02:13:29
 * @see          
 * @version       v1.0.0.1
 */
public class Thymeleaf {
	// 模板文件路径
	private static final String PREFIX = "templates/";
	private static final String CHARENCODE = "UTF-8";
	private static final String SUFFIX=".xml";
	private static final Logger log = LoggerFactory.getLogger(CDACreateServer.class);
	private static TemplateEngine templateEngine = new TemplateEngine();
	static {
		FileTemplateResolver resolver = new FileTemplateResolver();
		resolver.setTemplateMode("XML");
		//设置后缀
		resolver.setSuffix(SUFFIX);
		//设置路劲（前缀）
		// 获取当前程序所在目录
		//String strPath = System.getProperty("user.dir");

		resolver.setPrefix("Z:\\hlht\\templates\\");
		resolver.setCharacterEncoding(CHARENCODE);
		resolver.setCacheTTLMs(10000l);
		templateEngine.setTemplateResolver(resolver);
	}
	/*
	 * 	hName：模版html的名称
	 * 	html模版中需要填入的数据：th:text="${MEDICALINSTITUTIONS}"
	 * 	“MEDICALINSTITUTIONS”是data中的key，需要填入的数据就是value
	 *
	 * 	例如：模版中显示姓名：阿春  data：data.put("name","阿春") 模版中应用：th:text="${name}"
	 * 	返回：返回xml的String
	 */
	public static String transXml(Map<String, Object> dateMap, String templateName)  {
		FileTemplateResolver resolver = new FileTemplateResolver();
		resolver.setTemplateMode("XML");
		//设置路劲（前缀）
		// 获取当前程序所在目录
		String strPath = System.getProperty("user.dir");
		resolver.setPrefix(strPath+PREFIX);
		//设置后缀
		resolver.setSuffix(SUFFIX);
		resolver.setCharacterEncoding(CHARENCODE);
		resolver.setCacheTTLMs(10000l);
		TemplateEngine templateEngine = new TemplateEngine();
		templateEngine.setTemplateResolver(resolver);
		Context ctx = new Context();
		ctx.setVariables(dateMap);
		return templateEngine.process(templateName, ctx);
	}

	/*
	 * 	hName：模版html的名称
	 * 	html模版中需要填入的数据：th:text="${MEDICALINSTITUTIONS}"
	 * 	“MEDICALINSTITUTIONS”是data中的key，需要填入的数据就是value
	 * 
	 * 	例如：模版中显示姓名：阿春  data：data.put("name","阿春") 模版中应用：th:text="${name}"
	 * 	返回：返回xml的String
	 */
	public static void saveXml(String templateName,Map<String, Object> dateMap,String dirPath,String savePath) throws Exception {
		XMLWriter xmlWriter=null;
		FileOutputStream fos=null;
		try {
			//从类路径加载Thymeleaf模板
			ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
			resolver.setTemplateMode("XML");
			//设置路劲（前缀）
			resolver.setPrefix(PREFIX);
			//设置后缀
			resolver.setSuffix(SUFFIX);

			resolver.setCharacterEncoding(CHARENCODE);
			resolver.setCacheTTLMs(10000l);
			TemplateEngine templateEngine = new TemplateEngine();
			templateEngine.setTemplateResolver(resolver);
			Context ctx = new Context();
			ctx.setVariables(dateMap);
			String xmlStr = templateEngine.process(templateName, ctx);
			Document document = DocumentHelper.parseText(xmlStr);
			// dom4j提供了专门写入文件的对象XMLWriter
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding(CHARENCODE);
			//判断目录及文件是否存在
			//File file = new AHFile(dirPath);
			//if (!file.exists()) file.mkdirs();
			//File cdafile = new AHFile(dirPath+savePath );
			//if (cdafile.exists()) file.delete();
			fos = new AHFileOutputStream(dirPath+savePath);
			xmlWriter = new XMLWriter(fos, format);
			xmlWriter.write(document);
		}catch (Exception e){
			throw e;
		}finally {
			if(xmlWriter!=null){
				xmlWriter.flush();
				xmlWriter.close();
			}
			if(fos!=null){
				fos.close();
			}
		}
	}
	public static void saveCdaXml(String templateId,Map<String, Object> dateMap,String dirPath,String savePath) throws Exception {
		XMLWriter xmlWriter=null;
		FileOutputStream fos=null;
		try {
			String cloudTemplate="";
			StringWriter writer = new StringWriter();
			writer.write(cloudTemplate);
			//从类路径加载Thymeleaf模板
			FileTemplateResolver resolver = new FileTemplateResolver();
			resolver.setTemplateMode("XML");
			resolver.setPrefix(dirPath+PREFIX);
			//设置后缀
			resolver.setSuffix(SUFFIX);

			resolver.setCharacterEncoding(CHARENCODE);
			resolver.setCacheTTLMs(10000l);
			TemplateEngine templateEngine = new TemplateEngine();
			templateEngine.setTemplateResolver(resolver);
			Context ctx = new Context();
			ctx.setVariables(dateMap);
			String xmlStr = templateEngine.process(templateId, ctx);
			Document document = DocumentHelper.parseText(xmlStr);
			// dom4j提供了专门写入文件的对象XMLWriter
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding(CHARENCODE);
			//判断目录及文件是否存在
			//File file = new AHFile(dirPath);
			//if (!file.exists()) file.mkdirs();
			//File cdafile = new AHFile(dirPath+savePath );
			//if (cdafile.exists()) file.delete();
			fos = new AHFileOutputStream(dirPath+savePath);
			xmlWriter = new XMLWriter(fos, format);
			xmlWriter.write(document);
		}catch (Exception e){
			throw e;
		}finally {
			if(xmlWriter!=null){
				xmlWriter.flush();
				xmlWriter.close();
			}
			if(fos!=null){
				fos.close();
			}
		}
	}

	public static  Map<String, Object> saveNetCdaXml(String templateId, Map<String, Object> dateMap, String dirPath, String savePath, String templatePath, Map<String, Object> msgMap, JdbcTemplate jdbcTemplateHLHT) throws Exception {
		XMLWriter xmlWriter=null;
		FileOutputStream fos=null;
		boolean errCode=true;
			String xmlStr = templateEngineString(templateId,dateMap );
			write(dirPath+savePath,   xmlStr, CHARENCODE);

			if(xmlWriter!=null){
				xmlWriter.flush();
				xmlWriter.close();
			}
			if(fos!=null){
				fos.close();
			}
			if(errCode){
				return msgMap;
			}else{
				return null;
			}
	}





	public static void deleteTempFile(String filePath) {
		final File tmpFile = new File(filePath);
		if (tmpFile.exists()) {
			boolean flg = tmpFile.delete();
			if (!flg) {
				System.out.println("can not delete file{}"+ filePath);
			}
		}
	}
	public static String templateEngineString(String templateId, Map<String, Object> dateMap) {
		Context ctx = new Context();
		ctx.setVariables(dateMap);
		String xmlStr = templateEngine.process(templateId, ctx);
		return xmlStr;
	}
	public static void write(String path, String content, String encoding) throws Exception {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
		log.debug("内容写入文件开始");
		log.debug("输入写入文件路径：{}", path);
		//LOGGER.debug("输入写入文件内容：{}", content);
		log.debug("输入写入文件编码：{}", encoding);
		FileOutputStream fileOutputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		BufferedWriter bufferedWriter = null;
			  file = new File(path);
			if (file.exists()) {
				file.delete();
			}
			file.createNewFile();
			fileOutputStream = new FileOutputStream(file);
			outputStreamWriter = new OutputStreamWriter(fileOutputStream, encoding);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			bufferedWriter.write(content);
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}
			if (outputStreamWriter != null) {
				outputStreamWriter.close();
			}
			if (fileOutputStream != null) {
				fileOutputStream.close();
			}
		//LOGGER.info("内容：{}，写入文件：{}", content, path);
	}
}
