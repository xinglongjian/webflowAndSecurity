package com.xinglongjian.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 * web mvc config
 * @author root
 *
 */
@Configuration
public class WebMvcContextConfiguration extends WebMvcConfigurationSupport {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver;
		 viewResolver = new InternalResourceViewResolver();
		 viewResolver.setOrder(1);
		 viewResolver.setPrefix("/WEB-INF/jsp/");
		 viewResolver.setSuffix(".jsp");
		 return viewResolver;
	}
	
}
