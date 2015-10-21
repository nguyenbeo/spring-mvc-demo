package com.kthsoft.mvc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan(basePackages = "com.kthsoft.mvc.controller")
public class MvcDemoConfiguration {
	
	@Bean
	public ViewResolver getViewResolver() {
		UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
		urlBasedViewResolver.setPrefix("/WEB-INF/jsp");
		urlBasedViewResolver.setSuffix(".jsp");
		return urlBasedViewResolver;
	}
}
