package com.maple.aop;

import com.maple.aop.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 杨锋
 * @date 2022/11/19 16:17
 * desc:
 */

@EnableAspectJAutoProxy
@ComponentScan("com.maple.aop")
public class AopBootStrap {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopBootStrap.class);
		Service studentService = applicationContext.getBean("studentService", Service.class);
		studentService.addStudent();

		studentService.deleteStudent();

	}
}
