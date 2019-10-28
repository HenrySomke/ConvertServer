package com.ats.job.server;


import com.ats.job.tool.SpringContextsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class RunThreadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(RunThreadServlet.class);

	/**
	 * Constructor of the object.
	 */
	public RunThreadServlet() {
		super();
	}

	public void init() throws ServletException {
		//Thread CDACreateThread = (Thread) SpringContextsUtil.getBean("cdaCreateServer");
		try {
			synchronized (this) {
				//CDACreateThread.setName("cdaCreateServer");
				//CDACreateThread.start();
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}
