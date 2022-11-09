package com.maple.bootstrap;

import com.maple.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 杨锋
 * @date 2022/11/9 9:34
 * desc:
 */

public class AnnotationBootStrap {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBootStrapConfig.class);

		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);

	}
}
