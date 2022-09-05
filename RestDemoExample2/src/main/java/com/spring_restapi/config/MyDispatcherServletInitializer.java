package com.spring_restapi.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {MainConfig.class};
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
		
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
