package com.maple;

import com.maple.application.MapleClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/2 10:28
 * @Description:
 */


public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new MapleClassPathXmlApplicationContext("classpath:spring-bean.xml");

		// 这个类是通过FactoryBean创建的，是没有生命周期的；也没有后置处理器这些
		Object studentFactoryBean = applicationContext.getBean("studentFactoryBean");

		// BeanFactory创建，有生命周期；在BeanDefinition中可以修改
		Object student = applicationContext.getBean("student");

		System.out.println(studentFactoryBean);
		System.out.println(student);


	}
}
