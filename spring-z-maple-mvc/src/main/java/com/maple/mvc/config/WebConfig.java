package com.maple.mvc.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
/**
 * @author tguo
 * @EnableWebMvc 开启SpringMVC功能<br>
 * @Configuration 配置<br>
 * 启动webmvc 配置及扫包范围设置
 */
//@Configuration
//@EnableWebMvc
//@ComponentScan("com.maple.mvc")
public class WebConfig extends WebMvcConfigurerAdapter {
    // 创建SpringMVC视图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        //可以在JSP页面中通过${}访问beans
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }
}