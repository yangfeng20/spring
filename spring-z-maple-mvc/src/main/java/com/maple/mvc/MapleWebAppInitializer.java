package com.maple.mvc;

import com.maple.mvc.config.RootConfig;
import com.maple.mvc.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.util.Set;


/**
 * web应用程序初始化<br/>
 * 使用到了spi机制，在Java EE servlet3.0之后，定义了一个WebApplicationInitializer接口，允许用户通过spi扩展
 * @see javax.servlet.ServletContainerInitializer
 * tomcat实现了这种规范，在web容器启动时，通过服务发现机制【ServiceLoader.load(ServletContainerInitializer.class)】来加载spring扩展的实现并调用onStartup方法。
 * spring定义的实现为 {@link org.springframework.web.SpringServletContainerInitializer},并调用onStartUp方法；通过类上添加了{@link javax.servlet.annotation.HandlesTypes}注解
 * 在调用onStartUp方法时，会将@{@link javax.servlet.annotation.HandlesTypes}注解的值作为方法参数传入，然后在方法中调用了{@link WebApplicationInitializer}的onStartUp方法，也就是本类的方法做spring的初始化
 * @see org.springframework.web.SpringServletContainerInitializer#onStartup(Set, ServletContext)
 *
 *
 * @author maple
 * @date 2022/11/13
 */


public class MapleWebAppInitializer implements WebApplicationInitializer {


	/**
	 * 在启动时
	 * 主要作用是创建spring容器，创建springMvc容器，注册DispatcherServlet
	 *
	 * @param container 容器
	 */
	@Override
	public void onStartup(ServletContext container) {
		// Create the 'root' Spring application context
		// 创建spring的容器对象【主要是加载根配置类，往spring中加载配置类】
		AnnotationConfigWebApplicationContext rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(RootConfig.class);

		// Manage the lifecycle of the root application context
		// 在tomcat容器中添加监听器（spring容器）
		container.addListener(new ContextLoaderListener(rootApplicationContext));

		// Create the dispatcher servlet's Spring application context
		// 创建web容器，并加载web配置文件
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(WebConfig.class);

		// Register and map the dispatcher servlet
		// 创建注册并映射【前端处理器】dispatcherServlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher",dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}

}