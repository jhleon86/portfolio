package com.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.boot.interceptor.LoggerInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	private LoggerInterceptor loggerInterceptor; 

	@Override 
	public void addInterceptors( InterceptorRegistry registry ) { 
		registry.addInterceptor( loggerInterceptor ).addPathPatterns( "/**" ).excludePathPatterns("/resources/**", "/adminUserLogin", "/ajax/**"); 
	}
}
