package com.idea.cjyl.core.filter;

import java.util.ResourceBundle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitConfig implements ServletContextListener {

    @Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		ResourceBundle rb = ResourceBundle.getBundle("domainConfig");
		// //项目服务器域名
		String domainUrl = rb.getString("domainUrl").toString();
		sce.getServletContext().setAttribute("domainUrl", domainUrl);
		
	}
	
}