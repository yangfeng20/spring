package com.maple.bootstrap;

import com.maple.entity.Person;
import com.maple.entity.Student;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 杨锋
 * @date 2022/11/9 9:34
 * desc:
 */

public class AnnotationBootStrap {
	public static void main(String[] args) {
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBootStrapConfig.class);

		// 等价于上面的代码
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AnnotationBootStrapConfig.class);
		//applicationContext.refresh();

		// 可以使用这个方法添加自定义的beanFactoryPostProcessor或者使用@Compoent，或者朱勇@Bean标签
		//applicationContext.addBeanFactoryPostProcessor(new MapleBeanFactoryPostProcessor());


		// 定义并注册beanDefinition
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(Person.class);
		rootBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
		applicationContext.registerBeanDefinition("person", rootBeanDefinition);

		// 刷新容器
		applicationContext.refresh();

		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);
		System.out.println("applicationContext.getBean(\"person\", Person.class) = " + applicationContext.getBean("person", Person.class));
		System.out.println(applicationContext.getBean("person01"));

	}
}
