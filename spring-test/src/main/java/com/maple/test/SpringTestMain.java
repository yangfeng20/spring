package com.maple.test;

import com.maple.test.entity.Person01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 杨锋
 * @date 2023/1/8 22:23
 * desc:
 */

@ComponentScan
public class SpringTestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTestMain.class);

		Person01 person01 = applicationContext.getBean(Person01.class);
		System.out.println(person01);
	}
}
