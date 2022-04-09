package com.maple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/2 10:28
 * @Description:
 */


public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-bean.xml");

		Object studentFactoryBean = applicationContext.getBean("studentFactoryBean");

		System.out.println(studentFactoryBean);


	}
}
