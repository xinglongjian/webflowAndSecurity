package com.xinglongjian.config;

import org.springframework.binding.convert.converters.StringToEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.xinglongjian.converter.StringToEntityConverter;
import com.xinglongjian.domain.Category;
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
	
	@Bean
	public StringToEntityConverter categoryConverter()
	{
		return new StringToEntityConverter(Category.class);
	}

	@Override
	protected void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		registry.addConverter(categoryConverter());
		registry.addFormatter(new DateFormatter("dd-MM-yyyy"));
	}
	
	
	
}
