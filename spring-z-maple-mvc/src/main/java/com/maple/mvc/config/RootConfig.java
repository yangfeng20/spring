package com.maple.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author maple
 * web根容器
 */
@Configuration
@ComponentScan(basePackages = "com.maple.mvc")
public class RootConfig {
}