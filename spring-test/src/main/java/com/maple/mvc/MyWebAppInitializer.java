package com.maple.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;


/**
 * 我web应用程序初始化
 *
 * @author maple
 * @date 2022/11/13
 */

@ComponentScan("com.maple.mvc")
@Configuration
public class MyWebAppInitializer implements WebApplicationInitializer {
  
      @Override
      public void onStartup(ServletContext container) {
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext =
          new AnnotationConfigWebApplicationContext();
        rootContext.register(MyWebAppInitializer.class);
  
        // Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(rootContext));
  
        // Create the dispatcher servlet's Spring application context
        AnnotationConfigWebApplicationContext dispatcherContext =
          new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(MyWebAppInitializer.class);
  
        // Register and map the dispatcher servlet
        ServletRegistration.Dynamic dispatcher =
          container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
      }

   }