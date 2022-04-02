package com.maple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Author: 杨锋
 * @DateTime: 2022/4/2 10:28
 * @Description:
 */


public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-bean.xml");

		String[] beanNameArr = context.getBeanDefinitionNames();


		System.out.println(Arrays.toString(beanNameArr));
		System.out.println(context.getBeanDefinitionCount());
	}
}
