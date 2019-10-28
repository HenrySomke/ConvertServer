package com.ats.job.tool;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextsUtil implements ApplicationContextAware{
	private static ApplicationContext applicationContext;
	 
    public static Object getBean(String beanName) {
    	if (applicationContext == null) 
    	      throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextUtil"); 
        return applicationContext.getBean(beanName);
    }
 
    public static <T> T getBean(String beanName, Class<T> clazs) {
        return clazs.cast(getBean(beanName));
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        SpringContextsUtil.applicationContext = applicationContext;
    }
}
