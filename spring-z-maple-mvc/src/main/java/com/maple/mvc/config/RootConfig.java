package com.maple.mvc.config;

import com.maple.mvc.interceptor.MapleInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author maple
 * web根容器
 */
@Configuration
@ComponentScan(basePackages = "com.maple.mvc")
public class RootConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MapleInterceptor())
				.addPathPatterns("/**");
	}
}