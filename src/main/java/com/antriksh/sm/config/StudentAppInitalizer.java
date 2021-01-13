package com.antriksh.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitalizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configFile= {StudentAppConfig.class};
		return configFile;
	}

	@Override
	protected String[] getServletMappings() {
		String [] mapping= {"/"}; 
		return mapping;
	}

}
